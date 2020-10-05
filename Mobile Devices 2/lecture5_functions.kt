// example of a function that does not return a value
fun add( a:Int, b:Int):Unit{
    var s = a+b
    println("the result is $s")
}

// example of a function that returns a value
fun addWithReturn( a:Int, b:Int ):Int{
    var c = a + b
    return c
}
  
fun main() {
    
    /* initially we 
     * - declared 2 numeric variables
     * - added up the 2 variables
     * - printed the result
     * 
     * var n1=5
     * var n2=3
     * var s = n1+n2
     * println("the result is $s")
     * 
     */
    
    var n1=5
    var n2=3
	
    
    /*
     * using a function (i.e. add) that prints the result
     * 
     */
    add(n1, n2)
    
    /*
     * using a function (i.e. addWithReturn) that returns a value
     * 
     */
    var c = addWithReturn(n1, n2)
    println("The returned valuse of addWithReturn() is " + c)
    
}
