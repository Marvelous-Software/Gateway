/*
    John Maher
    Gateway - Mobile Devies I
    Mirco Speretta
    Classwork
    9/17/20
    Loops

*/

let w:number = 1;

console.log("While by 2s - odd")
while (w < 11) {
    console.log(w);
    w = w + 2
}

w = 0;

console.log("While by 2s - even")
while (w < 11) {
    console.log(w);
    w = w + 2
}

w = 11;

console.log("\n\nWhile backwards")
while (w > 0) {
    console.log(w);
    w--;
}

let f:number = 99;

console.log("\n\nFor by 2s - odd")
for (f = 1; f < 11; f+=2) {
    console.log(f);
}

console.log("\n\nFor by 2s - even")
for (f = 0; f < 11; f+=2) {
    console.log(f);
}

console.log("\n\nFor backwards")
for (f = 11; f > 0; f--) {
    console.log(f);
}

