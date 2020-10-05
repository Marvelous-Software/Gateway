/*
    John Maher
    Gateway - Mobile Devies I
    Mirco Speretta
    Classwork
    9/15/20
    conditions
    
*/

let num:number = 0
console.log("number", num)
if (num > 0) {
    console.log("is positive")
} else if (num < 0) {
    console.log("is negative")
} else {
    console.log("is zero")
}

let data1:number = 117;
let data2:number = 2212;
let data3:number = 29;

if (data1 > data2) {
    if (data1 > data3) {
        console.log(data1)
    } else {
        console.log(data3)
    }
} else {
    if (data2 > data3) {
        console.log(data2)
    } else {
        console.log(data3)
    }
}

console.group("is biggest")