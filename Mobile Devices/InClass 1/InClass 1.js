/*
    John Maher
    Gateway - Mobile Devies I
    Mirco Speretta
    Assignment 4.2
    9/15/20
    Exercise 1

    Declare 2 variables (e.g. a and b) and assign 2 numeric values to them. Then

    divide b by a, store the result into a third variable and print the result
    subtract b from a, store the result into a third variable and print the result
    multiply a by b, store the result into a third variable and print the result
    Use at most 3 variables to solve this!

*/
var a = 24;
var b = 98.6;
var answer;
console.log("Exercise 1");
answer = b / a;
console.log(b, "divided by", a, "is", answer);
answer = a - b;
console.log(b, "subtracted from", a, "is", answer);
answer = a * b;
console.log(b, "multiplied by", a, "is", answer);
/*
    Exercise 2

    Declare 2 string variables (e.g. st1 and st2) and assign the following
    values "My name is" and "your_name". Concatenate st1 with st2 and store
    the result into a third variable. Print the value of the third variable.

*/
var st1 = "My name is";
var st2 = "John Maher";
console.log("\n\nExercise 2");
answer = st1 + ' ' + st2;
console.log(answer);
/*
    Exercise 3

    Let's consider the variable a from Exercise 1, implement a conditional
    statement that

    prints "The value of a is positive" is a>0
    prints "The value of a is negative" if a<0

*/
console.log("\n\nExercise 3");
if (a > 0) {
    console.log("The value of a is positive");
}
else if (a < 0) {
    console.log("The value of a is negative");
}
else {
    console.log("a is zero");
}
/*
    Exercise 4

    Let's consider the variable b from Exercise 1, implement a conditional
    statement that

    prints "The value of b is even" if b is divisible by 2
    prints "The value of b is odd" if b is not divisible by 2

*/
console.log("\n\nExercise 4");
if (b % 2 == 0) {
    console.log("The value of b is even");
}
else {
    console.log("The value of b is odd");
}
/*
    Exercise 5

    implement a loop that prints all the numbers that are multiple of 4 between
    4 and 115.

*/
var i;
console.log("\n\nExercise 5");
// Step
for (i = 4; i < 115; i += 4) {
    console.log(i, "Step");
}
// Modulus
for (i = 4; i < 115; i++) {
    if (i % 4 == 0) {
        console.log(i, "Modulus");
    }
}
/*
    For fun

    Declare and assign an integer to a variable (e.g. c). Compare c with the
    variables from the first exercise (i.e. a and b) and print the biggest
    number, the second biggest number, and the smallest.

*/
var c = -9;
var bigger;
var biggest;
if (a > b) {
    if (a > c) {
        biggest = a;
        if (b > c) {
            bigger = b;
        }
        else {
            bigger = c;
        }
    }
    else {
        biggest = c;
        if (a > b) {
            bigger = a;
        }
        else {
            bigger = b;
        }
    }
}
else {
    if (b > c) {
        biggest = b;
        if (a > c) {
            bigger = a;
        }
        else {
            bigger = c;
        }
    }
    else {
        biggest = c;
        if (a > b) {
            bigger = a;
        }
        else {
            bigger = b;
        }
    }
}
console.log("Biggest is", biggest);
console.log("Second biggest is", bigger);
