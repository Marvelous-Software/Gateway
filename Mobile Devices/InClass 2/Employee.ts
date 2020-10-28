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

export class Employee {

    // properties or attributes
    id:string
    first_name:string
    last_name:string
    salary:number


    // accessors
    set set_id(id:string) {

        this.id = id;
    }
    get get_id() {
    
       return this.id;
    }

    set set_first_name(first_name:string) {

        this.first_name = first_name;
    }
    get get_first_name() {
    
       return this.first_name;
    }

    set set_last_name(last_name:string) {

        this.last_name = last_name;
    }
    get get_last_namer() {
    
       return this.last_name;
    }

    set set_salary(salary:number) {

        this.salary = salary;
    }
    get get_salary() {
    
       return this.salary;
    }

    // constructor
    constructor (id:string, first_name:string, last_name:string) {

        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.salary = 0;

    }

    // methods
    print_info() {

        console.log("Employee id - " + this.id + " - is " + this.first_name + " " + this.last_name + " earning " + this.salary);
    }

}

