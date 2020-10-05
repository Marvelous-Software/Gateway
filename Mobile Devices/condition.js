var num = 0;
console.log("number", num);
if (num > 0) {
    console.log("is positive");
}
else if (num < 0) {
    console.log("is negative");
}
else {
    console.log("is zero");
}
var data1 = 117;
var data2 = 2212;
var data3 = 29;
if (data1 > data2) {
    if (data1 > data3) {
        console.log(data1);
    }
    else {
        console.log(data3);
    }
}
else {
    if (data2 > data3) {
        console.log(data2);
    }
    else {
        console.log(data3);
    }
}
