"use strict";
//tsc --target ES5 student.ts (for setters & getters)
Object.defineProperty(exports, "__esModule", { value: true });
exports.Student = void 0;
var Student = /** @class */ (function () {
    // constructor
    function Student(id, first_name, last_name) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.classes = [];
    }
    Object.defineProperty(Student.prototype, "set_major", {
        // accessors
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
    Object.defineProperty(Student.prototype, "set_gpa", {
        set: function (gpa) {
            this.gpa = gpa;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Student.prototype, "get_gpa", {
        get: function () {
            return this.gpa;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Student.prototype, "get_classes", {
        get: function () {
            return this.classes;
        },
        enumerable: false,
        configurable: true
    });
    // methods
    Student.prototype.print_student_info = function () {
        console.log(this.first_name + " " + this.last_name + " " + this.id);
    };
    Student.prototype.add_Class = function (course) {
        this.classes.push(course);
    };
    Student.prototype.show_Classes = function () {
        return this.classes;
    };
    return Student;
}());
exports.Student = Student;
