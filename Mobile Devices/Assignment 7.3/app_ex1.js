"use strict";
/*
    John Maher
    Gateway - Mobile Devies I
    Mirco Speretta
    Classwork
    10/8/20
    objects
    
*/
Object.defineProperty(exports, "__esModule", { value: true });
var Student_1 = require("./Student");
var Course_1 = require("./Course");
var Book_1 = require("./Book");
var student_dmay = new Student_1.Student("0232444", "David", "May");
student_dmay.print_student_info();
var student_me = new Student_1.Student("01235813", "John", "Maher");
student_me.set_major = "Modile developemnt";
student_me.set_gpa = 3.84;
student_me.print_student_info();
console.log("Majoring in " + student_me.get_major);
var course = new Course_1.Course("Programming Mobile Devices I", "CSC* I262");
course.add_book2("custom", "Mirco");
course.add_days = "T";
course.add_days = "Th";
course.set_start = "10:40";
course.set_end = "noon";
student_me.add_Class(course);
course = new Course_1.Course("JAVA Programming I", "CSC* I223");
var book = new Book_1.Book("JAVA Programming", "Joyce Farrell");
course.add_book1(book);
course.add_days = "T";
course.set_start = "7:00";
course.set_end = "9:00";
student_me.add_Class(course);
course = new Course_1.Course("Prog. Logic & Design w/Python", "CSC* I124");
course.add_book2("Python Fundamentals", "Cengage");
course.add_days = "M";
course.add_days = "W";
course.set_start = "5:25";
course.set_end = "6:45";
student_me.add_Class(course);
course = new Course_1.Course("Systems Analysis & Design", "CSC* I250");
course.add_book2("System Analysis and Design", "Scott Tilley");
course.add_days = "W";
course.set_start = "10:40";
course.set_end = "noon";
student_me.add_Class(course);
course = new Course_1.Course("Adobe Photoshop", "DTP I6002");
course.add_days = "T";
course.add_days = "Th";
course.set_start = "6:00";
course.set_end = "10:00";
student_me.add_Class(course);
course = new Course_1.Course("How to Create a Web Page", "DTP I5002");
course.add_days = "M";
course.add_days = "W";
course.set_start = "6:00";
course.set_end = "10:00";
student_me.add_Class(course);
course = new Course_1.Course("Web Development w/PHP", "CSC* I257");
course.add_book2("Discussion", "Mirco");
course.add_book2("Videos", "Mirco");
course.add_days = "T";
course.add_days = "Th";
course.set_start = "noon";
course.set_end = "1:00";
student_me.add_Class(course);
console.log("GPA =", student_me.get_gpa);
var classes = student_me.show_Classes();
for (var _i = 0, classes_1 = classes; _i < classes_1.length; _i++) {
    course = classes_1[_i];
    console.log(course.get_code);
}
for (var r = 0; r < classes.length; r++) {
    console.log(classes[r].get_title);
}
for (var _a = 0, _b = classes[6].get_books; _a < _b.length; _a++) {
    book = _b[_a];
    console.log(book);
}
console.log(classes);
