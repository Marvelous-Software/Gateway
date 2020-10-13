/*
    John Maher
    Gateway - Mobile Devies I
    Mirco Speretta
    Classwork
    10/8/20
    objects
    
*/

import { Student } from "./Student"
import { Course } from "./Course"



let student_dmay = new Student("0232444", "David", "May");
student_dmay.print_student_info();

let student_me = new Student("01235813", "John", "Maher");
student_me.set_major = "Modile developemnt";
student_me.print_student_info();
console.log("Majoring in " + student_me.get_major);

let course = new Course("Programming Mobile Devices I", "CSC* I262");
course.add_days= "T";
course.add_days= "Th";
course.set_start = "10:40";
course.set_end = "noon";
student_me.add_Class(course);
course = new Course("JAVA Programming I", "CSC* I223");
course.add_days= "T";
course.set_start = "7:00";
course.set_end = "9:00";
student_me.add_Class(course);
course = new Course("Prog. Logic & Design w/Python", "CSC* I124");
course.add_days= "M";
course.add_days= "W";
course.set_start = "5:25";
course.set_end = "6:45";
student_me.add_Class(course);
course = new Course("Systems Analysis & Design", "CSC* I250");
course.add_days= "W";
course.set_start = "10:40";
course.set_end = "noon";
student_me.add_Class(course);
course = new Course("Adobe Photoshop", "DTP I6002");
course.add_days= "T";
course.add_days= "Th";
course.set_start = "6:00";
course.set_end = "10:00";
student_me.add_Class(course);
course = new Course("How to Create a Web Page", "DTP I5002");
course.add_days= "M";
course.add_days= "W";
course.set_start = "6:00";
course.set_end = "10:00";
student_me.add_Class(course);
course = new Course("Web Development w/PHP", "CSC* I257");
course.add_days= "T";
course.add_days= "Th";
course.set_start = "noon";
course.set_end = "1:00";
student_me.add_Class(course);

//console.log("Studying ", student_me.show_Classes());
let classes = student_me.show_Classes();

for (course of classes) {  
    console.log(course.get_code);  
}  

for (let r=0; r<classes.length; r++) {  
    console.log(classes[r].get_title);  
}  

