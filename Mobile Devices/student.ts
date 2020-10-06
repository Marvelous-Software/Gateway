//tsc --target ES5 student.ts (for setters & getters)

class Student {

    // properties or attributes
    id:string
    first_name:string
    last_name:string
    major:string
    gpa:number
    classes


    // accessors
    set set_major(major:string) {

        this.major = major;
    }
    get get_major() {
    
       return this.major;
    }

    // constructor
    constructor (id:string, first_name:string, last_name:string) {

        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;

    }

    // methods
    print_student_info() {

        console.log(this.first_name + " " + this.last_name + " " + this.id);

    }

    Register() {

        return 0;
    }
}


let student_dmay = new Student("0232444", "David", "May");
student_dmay.print_student_info();

let student_me = new Student("01235813", "John", "Maher");
student_me.set_major = "Modile developemnt";
student_me.print_student_info();
console.log("Majoring in " + student_me.get_major);