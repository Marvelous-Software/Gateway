/*
    John Maher
    Gateway - Mobile Devies I
    Mirco Speretta
    Assignment 3
    9/14/20
    Exercise 1

    Write a script that, given 2 numeric values (i.e. n1=2, n2=5), it swaps the
    values between n1 and n2.
    Before the swap: console.log( n1, " ", n2 ) will print "2 5"
    After the swap: console.log(n1, " ", n2) will print "5 2"

*/
var num1 = 2;
var num2 = 5;
var swap;
console.log("Exercise 1");
console.log(num1, " ", num2);
//Swap
swap = num1;
num1 = num2;
num2 = swap;
console.log(num1, " ", num2);
/*
    Exercise 2

    Use at least 3 relational operators to compare 2 numbers and print the result
    of the comparison

*/
console.log("\nExercise 2");
if (num1 == num2) {
    console.log("The first number is equal to the second one.");
}
if (num1 > num2) {
    console.log("The first number is bigger than the second one.");
}
if (num1 < num2) {
    console.log("The first number is smaller than the second one.");
}
/*
    Exercise 3

    Print into the console the string "I love Typescript!". Use at least 3 string
    variables and the concatenation operator to solve the exercise

*/
var subject = "I";
var verb = "love";
var predicate = "Typescript";
var punctuation = "!";
console.log("\nExercise 3");
console.log(subject + " " + verb + " " + predicate + " " + punctuation);
