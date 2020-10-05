/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */
​
fun main() {
    
    // example of printing a string
    println("Hello, world!!!")
    
    /*
     *  handling variables
     */
    
    // declaring the specific data type and using the safe call (i.e. ? operator) 
    var x:Int?=1
    println(x)
    x = null
    println(x)
    
    
    // List of Kotlin data type that we saw in class: https://kotlinlang.org/docs/reference/basic-types.html
     
    var a=9
    var b=2.0
​
    // examples of divisions where we convert data types (i.e. from Double to Int)
    var rd = a / b
    println(rd)
    
    // examples of divisions where we convert data types using the toFloat() method
    var rf = a.toFloat() / b
    println(rf)
    
    // example of conditional statement
    if ( a ==  5){
        print("correct")
    }else{
            print("not correct")
        }
   
}