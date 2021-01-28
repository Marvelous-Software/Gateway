"use strict";
/*
    John Maher
    Gateway - Mobile Devies I
    Mirco Speretta
    Assignment 5
    9/30/20
    Exercise 1

    Implement a "Course" class in Typescript. This class should handle:

    course title
    course code (e.g. CSC 262)
    Section (there could be more than one section per each course)
    add anything that you think could be part of a course (e.g. room ...)
    Create gets and sets methods for each parameter.

    Instantiate at least 3 classes to show how it works
    

Fall 2020
CRN	Course	Course Title	                        Credits	Level	Status	Midterm Grade	Final Grade
3549	CSC* I124	Prog. Logic & Design w/Python	3.000	GwCC Credit	**Web Registered** May 30, 2020
3736	CSC* I223	JAVA Programming I	            4.000	GwCC Credit	**Web Registered** Jul 21, 2020
3386	CSC* I250	Systems Analysis & Design	    3.000	GwCC Credit	**Web Registered** Jul 21, 2020
3960	CSC* I257	Web Development w/PHP	        4.000	GwCC Credit	**Web Registered** Aug 17, 2020
3550	CSC* I262	Programming Mobile Devices I	3.000	GwCC Credit	**Web Registered** Jul 27, 2020
4029	DTP I5002	Introduction to the MAC	        0.900	GwCC Non-Credit	**Registered** Aug 31, 2020
4030	DTP I6002	Adobe Photoshop	                0.440	GwCC Non-Credit	**Registered** Aug 31, 2020

*/
Object.defineProperty(exports, "__esModule", { value: true });
exports.Course = void 0;
//tsc --target ES5 <filename>.ts (for setters & getters)
var Book_1 = require("./Book");
var Course = /** @class */ (function () {
    // constructor
    function Course(title, code) {
        this.title = title;
        this.code = code;
        this.book = [];
        this.days = [];
    }
    Object.defineProperty(Course.prototype, "set_title", {
        // accessors 
        set: function (title) {
            this.title = title;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Course.prototype, "get_title", {
        get: function () {
            return this.title;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Course.prototype, "set_code", {
        set: function (code) {
            this.code = code;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Course.prototype, "get_code", {
        get: function () {
            return this.code;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Course.prototype, "set_instructor", {
        set: function (instructor) {
            this.instructor = instructor;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Course.prototype, "get_instructor", {
        get: function () {
            return this.instructor;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Course.prototype, "get_books", {
        get: function () {
            return this.book;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Course.prototype, "add_section", {
        set: function (section) {
            this.section.push(section);
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Course.prototype, "get_sections", {
        get: function () {
            return this.section;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Course.prototype, "add_days", {
        set: function (day) {
            this.days.push(day);
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Course.prototype, "get_days", {
        get: function () {
            return this.days;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Course.prototype, "set_start", {
        set: function (start) {
            this.start = start;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Course.prototype, "get_start", {
        get: function () {
            return this.start;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Course.prototype, "set_end", {
        set: function (end) {
            this.end = end;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Course.prototype, "get_end", {
        get: function () {
            return this.end;
        },
        enumerable: false,
        configurable: true
    });
    // methods
    Course.prototype.add_book1 = function (book) {
        this.book.push(book);
    };
    Course.prototype.add_book2 = function (title, author) {
        var book;
        book = new Book_1.Book(title, author);
        this.book.push(book);
    };
    Course.prototype.get_book = function (index) {
        if (index < this.book.length) {
            return this.book;
        }
        else {
            return null;
        }
    };
    Course.prototype.to_string = function () {
        return this.code + " " + this.title + " - " + this.days + " : " + this.book;
    };
    return Course;
}());
exports.Course = Course;
/*
Fall 2020
CRN	Course	Course Title	                        Credits	Level	Status	Midterm Grade	Final Grade
3549	CSC* I124	Prog. Logic & Design w/Python	3.000	GwCC Credit	**Web Registered** May 30, 2020
3736	CSC* I223	JAVA Programming I	            4.000	GwCC Credit	**Web Registered** Jul 21, 2020
3386	CSC* I250	Systems Analysis & Design	    3.000	GwCC Credit	**Web Registered** Jul 21, 2020
3960	CSC* I257	Web Development w/PHP	        4.000	GwCC Credit	**Web Registered** Aug 17, 2020
3550	CSC* I262	Programming Mobile Devices I	3.000	GwCC Credit	**Web Registered** Jul 27, 2020
4029	DTP I5002	Introduction to the MAC	        0.900	GwCC Non-Credit	**Registered** Aug 31, 2020
4030	DTP I6002	Adobe Photoshop	                0.440	GwCC Non-Credit	**Registered** Aug 31, 2020
*/
