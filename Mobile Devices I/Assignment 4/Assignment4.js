/*
    John Maher
    Gateway - Mobile Devies I
    Mirco Speretta
    Assignment 4
    9/15/20
    Exercise 1

    Declare 3 variables and assign an integer to each of them. Print the greatest number.

*/
var var1 = 2;
var var2 = 315;
var var3 = 4428;
console.log("Exercise 1");
console.log("Method 1");
if (var1 > var2) {
    if (var1 > var3) {
        console.log(var1);
    }
    else {
        console.log(var3);
    }
}
else {
    if (var2 > var3) {
        console.log(var2);
    }
    else {
        console.log(var3);
    }
}
console.log("is the greatest");
console.log("\nMethod 2");
if (var1 > var2 && var1 > var3) {
    console.log(var1);
}
else if (var2 > var3) {
    console.log(var2);
}
else {
    console.log(var3);
}
console.log("is the greatest");
/*

    Exercise 2

    Declare a variable and assign an integer between 1 and 7. Print the day of
        the week corresponding to the value.
    For instance: if the value was 1 then the day of the week would be Sunday;
        if the value was2 then the day of the week would be Monday; etc.

*/
var SUNDAY = 1;
var MONDAY = 2;
var TUESDAY = 3;
var WEDNESDAY = 4;
var THURSDAY = 5;
var FRIDAY = 6;
var SATURDAY = 7;
console.log("\nExercise 2");
var week = 4;
var response;
switch (week) {
    case SUNDAY:
        response = "Sunday";
        break;
    case MONDAY:
        response = "Monday";
        break;
    case TUESDAY:
        response = "Tuesday";
        break;
    case WEDNESDAY:
        response = "Wednesday";
        break;
    case THURSDAY:
        response = "Thursday";
        break;
    case FRIDAY:
        response = "Friday";
        break;
    case SATURDAY:
        response = "Saturday";
        break;
    default:
        response = "UNDEFINED";
        break;
}
console.log("The day is", response);
