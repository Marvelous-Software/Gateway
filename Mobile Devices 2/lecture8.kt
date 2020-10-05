fun getFirstName(  ):String{
// function storing the <firstName> and returining its value
 	var firstName = "Mark"
	return firstName    
}

fun getMajor(  ):String{
// function storing the <major> and returining its value
 	var major = "Computer Science"
	return major    
}

fun findBiggest(  a1:Int, a2:Int  ):Int{
// function findgin the biggest between 2 numbers
    if  (a1>= a2){
        return a1
    }else{
        return a2
    }
}

fun main(args: Array<String>) {

     // write a function that takes 2 integers and returns the biggest of the 2
     // main should print something like 
     // "The biggest number between <n1> and <n2> is <biggestNumber>"">
     // 
     
    println("My name is " + getFirstName() + " and my major is " + getMajor() );

    var q = 13
    var w = 11
    println("The biggest number between $q and $w is " + findBiggest(q,w) );

}