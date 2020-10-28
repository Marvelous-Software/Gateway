/*
    John Maher
    Gateway - Mobile Devies I
    Mirco Speretta
    In Class 2
    9/30/20
    Employee

    For this assignment you will use Typescript to 

    Create an employee.ts script that includes an Employee  class with
    parameters: first name, last name, employee id, and salary

    methods:
        print_info(): this method will print all the information related to 
                the employee
        set_salary(): this method takes a "salary" argument and updates the 
                corresponding parameter in the object 
        get_salary(): this method returns the value of the salary

    Create a company.ts script that creates 2 objects of the class Employee 
    and shows how to use its methods (i.e. print_info(), set_salary(), 
    and get_salary())

*/

//tsc --target ES5 student.ts (for setters & getters)

import { Employee } from "./Employee"

function CheckSalary (salary:number) {

    if (salary > 59999) {
        return "Congratulations"
    } else {
        return "Keep trying"
    }
}


let emp1 = new Employee("123", "John", "Maher");
emp1.set_salary = 80000;
emp1.print_info();
console.log(CheckSalary(emp1.get_salary))

let emp2 = new Employee("456", "Joe", "Smo");
emp2.set_salary = 25000;
emp2.print_info();
console.log(CheckSalary(emp2.get_salary))

