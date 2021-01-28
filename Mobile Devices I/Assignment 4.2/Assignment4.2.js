/*
    John Maher
    Gateway - Mobile Devies I
    Mirco Speretta
    Assignment 4.2
    9/15/20
    Exercise 1

    write a typescript program that counts in reverse order (i.e. 90 => 0) by 3

*/
var reverse3;
console.log("Exercise 1");
for (reverse3 = 90; reverse3 >= 0; reverse3 -= 3) {
    console.log(reverse3);
}
/*
    Exercise 2

    write a typescript program that, for all the numbers between 2 and 100,
    prints whether they are even or not. You must use the mod (i.e. %) to solve
    this exercise

*/
var even;
console.log("\n\nExercise 2");
for (even = 2; even <= 100; even++) {
    // Modulus
    if (even % 2 == 0) {
        console.log(even, "Modulus");
    }
    // Division
    if (even / 2 == Math.floor(even / 2)) {
        console.log(even, "Math.floor");
    }
}
/*
    For fun

    write a program that  prints the following patterns:

******
******
******
******

*
**
***
****
*****

    *
   **
  ***
 ****
*****

*/
var brick;
var brickCol;
var brickRow;
var brickAbsense;
var shape = '';
console.log("\n\nSquare");
for (brickRow = 1; brickRow < 5; brickRow++) {
    shape = '';
    for (brickCol = 1; brickCol < 7; brickCol++) {
        shape += '*';
    }
    console.log(shape);
}
console.log("\n\nRight Triangle");
for (brickRow = 1; brickRow < 6; brickRow++) {
    shape = '';
    for (brick = 1; brick <= brickRow; brick++) {
        shape += '*';
    }
    for (brickAbsense = 5 - brickRow; brickAbsense > 0; brickAbsense--) {
        shape += ' ';
    }
    console.log(shape);
}
console.log("\n\nLeft Triangle");
for (brickRow = 1; brickRow < 6; brickRow++) {
    shape = '';
    for (brickAbsense = 5 - brickRow; brickAbsense > 0; brickAbsense--) {
        shape += ' ';
    }
    for (brick = 1; brick <= brickRow; brick++) {
        shape += '*';
    }
    console.log(shape);
}
console.log("\n\nDiamond");
for (brickRow = 1; brickRow < 6; brickRow++) {
    shape = '';
    for (brickAbsense = 5 - brickRow; brickAbsense > 0; brickAbsense--) {
        shape += ' ';
    }
    for (brick = 1; brick <= brickRow; brick++) {
        shape += '*';
    }
    for (brick = 1; brick < brickRow; brick++) {
        shape += '*';
    }
    console.log(shape);
}
for (brickRow = 4; brickRow > 0; brickRow--) {
    shape = '';
    for (brickAbsense = 5 - brickRow; brickAbsense > 0; brickAbsense--) {
        shape += ' ';
    }
    for (brick = 1; brick <= brickRow; brick++) {
        shape += '*';
    }
    for (brick = 1; brick < brickRow; brick++) {
        shape += '*';
    }
    console.log(shape);
}
