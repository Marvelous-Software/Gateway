# John Maher
# Gateway - Python
# Henry Long
# Assessment 5
# 10/28/2020

'''
Create a deck.
Give each player two cards (chosen randomly using random.choice).
Display both hands
Prompt the player to either hit (that is, draw another card) or stay.
If the player hits, keep checking whether the total value of the player’s cards is equal to 21. If it is, then the player wins, and if it is above 21, then the player loses. Display each updated hand after each card draw.
If the player stays, then it’s the dealer’s turn to act. If the total value in the dealer’s hand is less than 17, then they must hit. If it is greater than or equal to 17 but less than or equal to 21, then the dealer must stay. If at any time the dealer’s total value is above 21, then the dealer busts and the player wins.
Finally, if both the player and dealer scores are below 21, and no one has busted yet, the player with the highest total wins. In the case of a tie, the dealer wins.
'''
from itertools import product
from random import choice, seed
from os import linesep


suits = {'hearts', 'clubs', 'spades', 'diamonds'}
numbers = set([i for i in range(2,15)])
a = 551
seed(a)


def create_standard_deck():

    deck = []
    for s in sorted(suits):
        for r in range(2, 15):
            deck.append((s, r))

    return deck

def get_all_cards(deck):
    pass


def get_all_twos(deck):
    pass


def get_all_aces(deck):
    pass


def get_card_number(deck, card_number):
    pass


def get_card_suit(deck, suit):
    pass


def get_number_and_suit(deck, num, suit):
    pass


def remove_card_from_deck(deck, suit, num):
    pass


def remove_suit_from_deck(deck, suit):
    pass


def remove_number_from_deck(deck, number):
    pass


def add_card_to_deck(deck, suit, num):
    pass


def add_suit_to_deck(deck, suit):
    pass


def add_number_to_deck(deck, number):
    pass


def draw_card(deck):
    
    card = choice(deck)
    deck.remove(card)

    return card


def display_dealer(opponent, start=False):
    print('Dealer:')
    if start:
        the_output = [opponent[0], ('?', '?')]
        print(the_output)
    else:
        print(opponent)


def display_player(player):
    print('Player:')
    print(player)


def get_count(player):
    count = 0
    for card in player:
        rank = card[1]
        if (rank < 11):
            count += rank
        elif (rank <14):
            count += 10
        else:
            count += 11

    return count


def check_cards(player):
    
    count = get_count(player)
    if count == 21:
        rc = 'WIN'
    elif count > 21:
        rc = 'BUST'
    else:
        rc = 'OK' 

    return rc


def create_blackjack_game(user_input):

    player = []
    dealer = []

    deck = create_standard_deck()
    player.append(draw_card(deck)) 
    dealer.append(draw_card(deck)) 
    player.append(draw_card(deck)) 
    dealer.append(draw_card(deck)) 
    playerScore = get_count(player)
    dealerScore = get_count(dealer)
    display_dealer(dealer, start=True)
    display_player(player)
    


    if not user_input:
        player_action = input('press h to hit, s to stand, q to quit.').lower().strip(linesep)
        while player_action not in ('s', 'h', 'q'):
            player_action = input('press h to hit, s to stand, q to quit.').lower().strip(linesep)
    else:
        player_action = user_input.pop(0)

    if player_action == 'q':
        return 0
    while player_action != 'q':

        if player_action == 'h':
            player.append(draw_card(deck)) 
            playerScore = get_count(player)
            display_player(player)
        else:
            while dealerScore < 17 and check_cards(player) != 'BUST':
                dealer.append(draw_card(deck)) 
                dealerScore = get_count(dealer)
                display_dealer(dealer)

        if not user_input:
            player_action = input('press h to hit, s to stand, q to quit.').lower().strip(linesep)
            while player_action not in ('s', 'h', 'q'):
                player_action = input('press h to hit, s to stand, q to quit.').lower().strip(linesep)
            if player_action == 'q':
                return 0
        else:
            player_action = user_input.pop(0)

    display_dealer(dealer)

    playerBust = (check_cards(player) == 'BUST')
    dealerBust = (check_cards(dealer) == 'BUST')
    if not (playerBust | dealerBust):
        if playerScore > dealerScore:
            return 1
        else:
            return -1
    elif playerBust:
        print("Player busts!")
        return -1
    else:
        print("Computer busts!")
        return 1

winner = create_blackjack_game([])
if winner == 1:
    print("Player wins!")
else:
    print("Computer wins!")
