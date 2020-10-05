/*
    John Maher
    Gateway - Mobile Devies I
    Mirco Speretta
    Assignment 5
    9/24/20
    Exercise 1

    Write a function in Typescript that takes 1 integer as parameters and 
    returns true if the number is even, false otherwise.

*/

function Even (num:number) {

    let even:boolean = false

    if (num != 0) {
        even = ((num % 2) == 0)
    }
    
    return even

}


/*
    Exercise 2

    Write a function in Typescript that takes 2 integers as parameters and 
    returns true if the first parameter is divisible by the second parameter,
    false otherwise.

*/


function EvenlyDivisible (int1:number, int2:number) {

    return ((int1 % int2) == 0)
}

