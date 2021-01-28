"use strict";
/*
    John Maher
    Gateway - Mobile Devies I
    Mirco Speretta
    Assignment 7.4
    10/20/20
    InClass

*/
Object.defineProperty(exports, "__esModule", { value: true });
exports.Book = void 0;
//tsc --target ES5 <filename>.ts (for setters & getters)
var Book = /** @class */ (function () {
    // constructor
    function Book(title, author) {
        this.title = title;
        this.author = author;
    }
    Object.defineProperty(Book.prototype, "set_title", {
        // accessors 
        set: function (title) {
            this.title = title;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Book.prototype, "get_title", {
        get: function () {
            return this.title;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Book.prototype, "set_author", {
        set: function (author) {
            this.author = author;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Book.prototype, "get_author", {
        get: function () {
            return this.author;
        },
        enumerable: false,
        configurable: true
    });
    // methods
    Book.prototype.print_book_info = function () {
        console.log(this.title + " by " + this.author);
    };
    return Book;
}());
exports.Book = Book;
