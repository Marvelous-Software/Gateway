"use strict";
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
Object.defineProperty(exports, "__esModule", { value: true });
exports.Employee = void 0;
//tsc --target ES5 student.ts (for setters & getters)
var Employee = /** @class */ (function () {
    // constructor
    function Employee(id, first_name, last_name) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.salary = 0;
    }
    Object.defineProperty(Employee.prototype, "set_id", {
        // accessors
        set: function (id) {
            this.id = id;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Employee.prototype, "get_id", {
        get: function () {
            return this.id;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Employee.prototype, "set_first_name", {
        set: function (first_name) {
            this.first_name = first_name;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Employee.prototype, "get_first_name", {
        get: function () {
            return this.first_name;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Employee.prototype, "set_last_name", {
        set: function (last_name) {
            this.last_name = last_name;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Employee.prototype, "get_last_namer", {
        get: function () {
            return this.last_name;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Employee.prototype, "set_salary", {
        set: function (salary) {
            this.salary = salary;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Employee.prototype, "get_salary", {
        get: function () {
            return this.salary;
        },
        enumerable: false,
        configurable: true
    });
    // methods
    Employee.prototype.print_info = function () {
        console.log("Employee id - " + this.id + " - is " + this.first_name + " " + this.last_name + " earning " + this.salary);
    };
    return Employee;
}());
exports.Employee = Employee;
