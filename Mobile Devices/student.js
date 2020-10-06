//tsc --target ES5 student.ts (for setters)
var Student = /** @class */ (function () {
    // constructor
    function Student(id, first_name, last_name) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
    }
    Object.defineProperty(Student.prototype, "set_major", {
        set: function (major) {
            this.major = major;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Student.prototype, "get_major", {
        get: function () {
            return this.major;
        },
        enumerable: false,
        configurable: true
    });
    // methods
    Student.prototype.print_student_info = function () {
        console.log(this.first_name + " " + this.last_name + " " + this.id);
    };
    Student.prototype.Register = function () {
        return 0;
    };
    return Student;
}());
var student_dmay = new Student("0232444", "David", "May");
student_dmay.print_student_info();
var student_me = new Student("01235813", "John", "Maher");
student_me.set_major = "Modile developemnt";
student_me.print_student_info();
console.log("Majoring in " + student_me.get_major);
