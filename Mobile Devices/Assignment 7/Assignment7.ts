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

//tsc --target ES5 <filename>.ts (for setters & getters)

export class Course {

    // properties
    private title:string
    private code:string
    private section:string[]
    private days:string[]
    private start:string
    private end:string


    // accessors 
    set set_title(title:string) {

        this.title = title;
    }
    get get_title() {
    
       return this.title;
    }

    set set_code(code:string) {

        this.code = code;
    }
    get get_code() {
    
       return this.code;
    }

    set add_section(section:string) {

        this.section.push(section);
    }
    get get_sections() {
    
       return this.section;
    }

    set add_days(day:string) {

        this.days.push(day);
    }
    get get_days() {
    
       return this.days;
    }

    set set_start(start:string) {

        this.start = start;
    }
    get get_start() {
    
       return this.start;
    }

    set set_end(end:string) {

        this.end = end;
    }
    get get_end() {
    
       return this.end;
    }

    // constructor
    constructor (title:string, code:string) {

        this.title = title;
        this.code = code;
        this.days = [];

    }

    // methods
    to_string() {

        return this.code + " " + this.title + " - " + this.days;

    }

}
/*
Fall 2020
CRN	Course	Course Title	                        Credits	Level	Status	Midterm Grade	Final Grade
3549	CSC* I124	Prog. Logic & Design w/Python	3.000	GwCC Credit	**Web Registered** May 30, 2020	 	 
3736	CSC* I223	JAVA Programming I	            4.000	GwCC Credit	**Web Registered** Jul 21, 2020	 	 
3386	CSC* I250	Systems Analysis & Design	    3.000	GwCC Credit	**Web Registered** Jul 21, 2020	 	 
3960	CSC* I257	Web Development w/PHP	        4.000	GwCC Credit	**Web Registered** Aug 17, 2020	 	 
3550	CSC* I262	Programming Mobile Devices I	3.000	GwCC Credit	**Web Registered** Jul 27, 2020	 	 
4029	DTP I5002	Introduction to the MAC	        0.900	GwCC Non-Credit	**Registered** Aug 31, 2020	 	 
4030	DTP I6002	Adobe Photoshop	                0.440	GwCC Non-Credit	**Registered** Aug 31, 2020	 */


