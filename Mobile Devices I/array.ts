/*
    John Maher
    Gateway - Mobile Devies I
    Mirco Speretta
    Classwork
    9/8/20
    variables
    
*/

// array of numbers
let arr_num:number [] = [1, 2, 3, 4, 5, 6, 7]
console.log("The first element is ")
console.log(arr_num[0])
console.log("The third element is ")
console.log(arr_num[2])
console.log("The last element is ")
console.log(arr_num[6])

// array of strings
let arr_string:string [] = ["apple", "orange", "blueberry", "banana", "strawberry", "apricot", "peach"]
console.log("\nThe second element is ")
console.log(arr_string[1])
console.log("The last element is ")
console.log(arr_string[6])

// print all elements
console.log("\nMethod 1 ")
console.log(arr_string)
console.log("Method 2 ")
let i:number
for (i=0; i<arr_string.length; i++)
{
    console.log("the element at position", i, "is", arr_string[i])
}

// create an empty array
let arr_num2:number []
let arr_num3 = new Array()
arr_num3 = new Array(4)
arr_num3 = [7, 4, 9, 3]


console.log("\nSearching for an element in an array")
console.log(arr_num3)
console.log("the index of 9 is", arr_num3.indexOf(9))
console.log("the index of 5 is", arr_num3.indexOf(5))


console.log("\nUsing the push method, pushing -2")
console.log("before: ", arr_num3)
arr_num3.push(-2)
console.log("after push: ", arr_num3)
console.log("Using the pop method")
arr_num3.pop()
console.log("after pop: ", arr_num3)


console.log("\nChecking for vowels")
function getVowels(letters:string[]) { 

    let vowels:string = "";
    

    letters.forEach(function (value) {
        if("AEIOU".indexOf(value) >= 0) {
            vowels += value;
        }
      }); 
    
      return vowels;

 }

let alphabet = ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", 
            "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"];

console.log(getVowels(alphabet));
