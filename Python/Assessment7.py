# John Maher
# Gateway - Python
# Henry Long
# Assessment 7
# 11/23/2020


#!/usr/bin/env python
# -*- coding: utf-8 -*-

from random import choice, seed
from itertools import product
from time import sleep
import subprocess as sp


SEED_NUMBER = 0

seed(SEED_NUMBER)

empty_cell = ' '

replication_cells = ['up', 'right', 'down', 'left']

replication_order = {
    'up': (-1, 0),
    'right': (0, 1),
    'down': (1, 0),
    'left': (0, -1)
}


class Cell:
    count = 0

    def __init__(self, position=(0, 0)):
        self.x = position[0]
        self.y = position[1]
        self.lifespan = self._set_lifespan()
        self.symbol = self._set_symbol()
        Cell.count += 1

    def __repr__(self):
        return self.symbol

    def _set_symbol(self):
        return 'c'

    def _set_lifespan(self):
        return 100

    def get_location(self):
        return f'(x={self.x}, y={self.y})'

    def intended_position(self):
        return (self.x, self.y)

    def set_location(self, position):
        self.x, self.y = position

    @staticmethod
    def reduce_count():
        Cell.count -= 1

    @staticmethod
    def reset_count():
        Cell.count = 0

    @staticmethod
    def reset_all_cell_counts():
        Cell.count = 0
        Generic.reset_count()
        Ecoli.reset_count()
        Structure.reset_count()
        HunterKiller.reset_count()


class Generic(Cell):

    count = 0

    def __init__(self, position=(0, 0)):
        super().__init__(position=position)
        Generic.count += 1

  
    def _set_lifespan(self):
        return 100

    def _set_symbol(self):
        return 'o'

    def intended_position(self):
        self.x += choice([-2, -1, 0, 1, 2])
        self.y += choice([-2, -1, 0, 1, 2])

    @staticmethod
    def reduce_count():
        Generic.count -= 1
        Cell.reduce_count()

    @staticmethod
    def reset_count():
        Generic.count = 0

class Ecoli(Cell):

    count = 0

    def __init__(self, position=(0, 0)):
        super().__init__(position=position)
        Ecoli.count += 1

    def _set_lifespan(self):
        return 7

    def _set_symbol(self):
        return 'e'

    @staticmethod
    def reduce_count():
        Ecoli.count -= 1
        Cell.reduce_count()

    @staticmethod
    def reset_count():
        Ecoli.count = 0

class Structure(Cell):

    count = 0

    def __init__(self, position=(0, 0)):
        super().__init__(position)
        Structure.count += 1

    def _set_lifespan(self):
        return 10000

    def _set_symbol(self):
        return 's'

    @staticmethod
    def reduce_count():
        Structure.count -= 1
        Cell.reduce_count()

    @staticmethod
    def reset_count():
        Structure.count = 0

class HunterKiller(Cell):

    count = 0
    kill_count = 0

    def __init__(self, position=(0, 0)):
        super().__init__(position=position)
        HunterKiller.count += 1

    def _set_lifespan(self):
        return 350

    def _set_symbol(self):
        return 'x'

    def intended_position(self):
        self.x += choice([-1, 0, 1])
        self.y += choice([-1, 0, 1])

    @staticmethod
    def reduce_count():
        HunterKiller.count -= 1
        Cell.reduce_count()

    @staticmethod
    def reset_count():
        HunterKiller.count = 0


def reset_all_cell_counts():
    cell_types = [Cell, Generic, Ecoli, Structure, HunterKiller]
    #insert your code here


class PetriDish:
    def __init__(self, size=30):
        self.SIZE = size
        self.all_positions = []
        self.available_positions = []
        self.world = self._create_world()
        self.counter = 0
        self.world_state = ['']
        self.all_cells = []
        for i in range(self.SIZE):
            new_col = dict()
            for j in range(self.SIZE):
                new_col[j] = empty_cell
            self.world[i] = new_col

    def __repr__(self):
        return_string = '|'
        return_string += '-' * self.SIZE
        return_string += '|\n|'
        for i in range(self.SIZE):
            for j in range(self.SIZE):
                return_string += self.world[(i, j)]
            return_string += '|\n|'
        return_string += '-' * self.SIZE
        return_string += '|'
        return return_string

    def _create_world(self):
        world = dict()
        self.all_positions = [(i, j) for i, j in product(range(self.SIZE), range(self.SIZE))]
        for position in self.all_positions:
            world[position] = empty_cell
            self.available_positions.append(position)
        return world

    def add_to_world(self, cell):
        self.world[(cell.x, cell.y)] = cell.symbol
        self.all_cells.append(cell)
        self.available_positions.remove((cell.x, cell.y))
        pass

    def _has_world_changed(self):
        start = self.world_state[-1]
        end = self.__repr__()
        return start != end

    def update_world(self):
        for key in self.world:
            self.world[key] = ' '
        for cell in self.all_cells:
            self.world[(cell.x, cell.y)] = cell.symbol

    def print_header(self):
        sp.call('clear', shell=True);
        print(f'Iteration: {self.counter} | ', end='')
        print(f'Total Cells: {Cell.count} | ', end='')
        print(f'Generic Cells: {Generic.count} | ', end='')
        print(f'Ecoli Cells: {Ecoli.count} | ', end='')
        print(f'Structure Cells: {Structure.count} | ')
        print(f'Hunter Killer: {HunterKiller.count} | ', end='')
        print(f'Hunter Killer Kill Count: {HunterKiller.kill_count}')

    def tick(self):
        self.world_state.append(self.__repr__())
        self.counter += 1

        iteration_array = list(self.all_cells)

        for cell in iteration_array:
            if cell.lifespan <= 0:
                cell.reduce_count()
                self.available_positions.append((cell.x, cell.y))
                self.all_cells.remove(cell)
                continue
            else:
                cell.lifespan -= 1

            if cell.symbol == 'e':

                if self.counter % 3 == 0:
                    for replication_cell in replication_cells:
                        test_pos = (cell.x + replication_order[replication_cell][0],
                                    cell.y + replication_order[replication_cell][1])
                        if test_pos in self.available_positions:
                            self.add_to_world(Ecoli(position=test_pos))
                            break

                for i, j in product(range(-4, 5), range(-4, 5)):
                    if (i, j) == (0, 0):
                        continue
                    target_pos = (cell.x + i, cell.y + j)
                    if target_pos[0] >= self.SIZE or target_pos[1] >= self.SIZE or target_pos[0] < 0 or target_pos[
                        1] < 0:
                        continue
                    if self.world[target_pos] == 'x':
                        HunterKiller.kill_count += 1
                        self.available_positions.append((cell.x, cell.y))
                        cell.reduce_count()
                        self.all_cells.remove(cell)
                        break

            if cell.symbol == 'x':
                if self.counter > 10:
                    cell.symbol = 'x'

            if cell.symbol == 'S':
                continue

            new_pos = cell.intended_position()
            if new_pos in self.available_positions:
                self.available_positions.remove(new_pos)
                self.available_positions.append((cell.x, cell.y))
                cell.set_location(new_pos)

        self.update_world()

    def begin_simulation(self, max_iterations=100000, delay=0.1, movement=False):
        self.max_iterations = max_iterations
        while self._has_world_changed() and self.counter < self.max_iterations:
            self.print_header()
            print(self)
            print('\n')
            self.tick()
            sleep(delay)
            if not movement:
                break

    def simulate_n_steps(self, delay=0.1, iterations = 1):
        for _ in range(iterations):
            self.print_header()
            print(self)
            print('\n')
            self.tick()
            sleep(delay)





def activity1_task1():
    petri_dish = PetriDish(5)
    petri_dish.begin_simulation()
    return petri_dish


def activity1_task2():
    petri_dish = PetriDish(30)
    petri_dish.add_to_world(Cell(position=(0, 0)))
    petri_dish.add_to_world(Cell(position=(5, 5)))
    petri_dish.add_to_world(Cell(position=(10, 10)))
    petri_dish.add_to_world(Cell(position=(15, 15)))
    petri_dish.begin_simulation()
    return petri_dish


def activity1_task3():
    seed(SEED_NUMBER) #do not alter this
    petri_dish = PetriDish(30)
    for cells in range(10):
        petri_dish.add_to_world(Cell(position=choice(petri_dish.available_positions)))
    petri_dish.begin_simulation()
    return petri_dish


def activity2_task1():
    seed(1) #do not alter this
    petri_dish = PetriDish(30)
    for cells in range(10):
        petri_dish.add_to_world(Generic(position=choice(petri_dish.available_positions)))
    petri_dish.begin_simulation()
    return petri_dish


def activity2_task2():
    seed(2) #do not alter this
    petri_dish = PetriDish(30)
    for cells in range(10):
        petri_dish.add_to_world(Ecoli(position=choice(petri_dish.available_positions)))
    petri_dish.begin_simulation()
    return petri_dish


def activity2_task3():
    seed(3) #do not alter this
    petri_dish = PetriDish(30)
    for cells in range(10):
        petri_dish.add_to_world(Structure(position=choice(petri_dish.available_positions)))
    petri_dish.begin_simulation()
    return petri_dish

def activity2_task4():
    seed(4) #do not alter this
    petri_dish = PetriDish(30)
    for cells in range(10):
        petri_dish.add_to_world(HunterKiller(position=choice(petri_dish.available_positions)))
    petri_dish.begin_simulation()
    return petri_dish


def activity2_task5():
    seed(SEED_NUMBER) #do not alter this
    petri_dish = PetriDish(30)
    for cells in range(10):
        petri_dish.add_to_world(Cell(position=choice(petri_dish.available_positions)))
    for cells in range(10):
        petri_dish.add_to_world(Generic(position=choice(petri_dish.available_positions)))
    for cells in range(10):
        petri_dish.add_to_world(Ecoli(position=choice(petri_dish.available_positions)))
    for cells in range(10):
        petri_dish.add_to_world(Structure(position=choice(petri_dish.available_positions)))
    for cells in range(10):
        petri_dish.add_to_world(HunterKiller(position=choice(petri_dish.available_positions)))
    petri_dish.begin_simulation()
    return petri_dish


def activity3_task1():
    seed(SEED_NUMBER) #do not alter this
    petri_dish = PetriDish(30)
    for cells in range(10):
        petri_dish.add_to_world(Generic(position=choice(petri_dish.available_positions)))
    for cells in range(20):
        petri_dish.add_to_world(Ecoli(position=choice(petri_dish.available_positions)))
    for cells in range(30):
        petri_dish.add_to_world(HunterKiller(position=choice(petri_dish.available_positions)))
    #petri_dish.begin_simulation()

    print(Cell.count, Generic.count, Ecoli.count, Structure.count, HunterKiller.count)
    return Cell.count, Generic.count, Ecoli.count, Structure.count, HunterKiller.count


def activity3_task2a():
    activity3_task1()
    activity3_task1()

    return Cell.count, Generic.count, Ecoli.count, Structure.count, HunterKiller.count


def activity3_task2b():
    activity3_task1()
    Cell.reset_all_cell_counts()
    activity3_task1()

    return Cell.count, Generic.count, Ecoli.count, Structure.count, HunterKiller.count


def activity3_task3():
    seed(SEED_NUMBER) #do not alter this
    petri_dish = PetriDish(30)
    for cells in range(10):
        petri_dish.add_to_world(Generic(position=choice(petri_dish.available_positions)))
    for cells in range(20):
        petri_dish.add_to_world(Ecoli(position=choice(petri_dish.available_positions)))
    for cells in range(30):
        petri_dish.add_to_world(HunterKiller(position=choice(petri_dish.available_positions)))
    for r in range(5):
        Generic.reduce_count()
    for r in range(5):
        Ecoli.reduce_count()

    print(Cell.count, Generic.count, Ecoli.count, Structure.count, HunterKiller.count)
    return Cell.count, Generic.count, Ecoli.count, Structure.count, HunterKiller.count


def activity3_task4():
    seed(SEED_NUMBER) #do not alter this
    petri_dish = PetriDish(30)
    for cells in range(10):
        petri_dish.add_to_world(Generic(position=choice(petri_dish.available_positions)))
    for cells in range(20):
        petri_dish.add_to_world(Ecoli(position=choice(petri_dish.available_positions)))
    for cells in range(30):
        petri_dish.add_to_world(HunterKiller(position=choice(petri_dish.available_positions)))
    petri_dish.simulate_n_steps()

    print([i.lifespan for i in petri_dish.all_cells])
    return petri_dish


def activity3_task5():
    seed(SEED_NUMBER)  # do not alter this
    reset_all_cell_counts() # do not alter this
    petri_dish = PetriDish(30)
    for cells in range(25):
        petri_dish.add_to_world(Generic(position=choice(petri_dish.available_positions)))
    for cells in range(75):
        petri_dish.add_to_world(Ecoli(position=choice(petri_dish.available_positions)))
    for cells in range(13):
        petri_dish.add_to_world(HunterKiller(position=choice(petri_dish.available_positions)))
    for cells in range(100):
        petri_dish.add_to_world(Structure(position=choice(petri_dish.available_positions)))
    petri_dish.simulate_n_steps()
    petri_dish.begin_simulation(movement=True)

    return petri_dish


if __name__ == '__main__':

    # uncomment the relevant task as needed. Complete the tasks in order.
    #p = PetriDish()
    #print(p)

    #activity1_task1()
    #activity1_task2()
    #activity1_task3()
    #
    #activity2_task1()  #??? - G
    #activity2_task2()  # - E
    #activity2_task3()  #??? - S
    #activity2_task4()   #??? - H
    #activity2_task5()  #???
    #
    #activity3_task1()
    #activity3_task2a()
    #activity3_task2b()
    #activity3_task3()
    #activity3_task4()
    activity3_task5()

    pass
