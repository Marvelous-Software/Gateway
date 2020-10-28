/*
    John Maher
    Gateway - Mobile Devies I
    Mirco Speretta
    Assignment 7.4
    10/20/20
    InClass

*/

//tsc --target ES5 <filename>.ts (for setters & getters)

export class Book {

    // properties
    private title:string
    private author:string


    // accessors 
    set set_title(title:string) {

        this.title = title;
    }
    get get_title() {
    
       return this.title;
    }

    set set_author(author:string) {

        this.author = author;
    }
    get get_author() {
    
       return this.author;
    }

    // constructor
    constructor (title:string, author:string) {

        this.title = title;
        this.author = author;

    }

    // methods
    print_book_info() {

        console.log(this.title + " by " + this.author);

    }

}