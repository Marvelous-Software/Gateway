/*
    John Maher
    Gateway - Mobile Devies I
    Mirco Speretta
    Assignment 5
    9/30/20
    Exercise 1

    write a script in Typescript that

        declares an empty array with 4 elements
        assign the following elements into the array:
            "I"
            "love"
            "Typescript"
            "!"

    create a function that
        takes an array of strings as argument
        returns (i.e. does not print into the console) a string where all
        elements from the array are concatenated. Add a space between each
        element. (e.g. it returns "I love Typescript !")

    invoke the function and print the string returned into the console
*/
function Message(words) {
    var message = "";
    var r;
    for (r = 0; r < words.length; r++) {
        message += words[r] + " ";
    }
    return message.trim();
}
var sentance = ["I", "love", "Typescript", "!"];
console.log(Message(sentance));
