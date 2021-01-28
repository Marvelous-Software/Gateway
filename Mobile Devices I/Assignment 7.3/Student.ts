//tsc --target ES5 student.ts (for setters & getters)

import { Course } from "./Course"

export class Student {

    // properties or attributes
    id:string
    first_name:string
    last_name:string
    major:string
    gpa:number
    classes:Course[]


    // accessors
    set set_major(major:string) {

        this.major = major;
    }
    get get_major() {
    
       return this.major;
    }

    set set_gpa(gpa:number) {

        this.gpa = gpa;
    }
    get get_gpa() {
    
       return this.gpa;
    }

    get get_classes(){
        return this.classes
    }

    // constructor
    constructor (id:string, first_name:string, last_name:string) {

        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.classes = [];

    }

    // methods
    print_student_info() {

        console.log(this.first_name + " " + this.last_name + " " + this.id);

    }

    add_Class(course:Course) {

        this.classes.push(course);
    }

    show_Classes() {

        return this.classes;

    }
}
