// outer class
class GWCCPerson{
    
    // example of propery in the inner class
    public var garage:String = "GWCC garage"
    
    // inner class
    inner class Student( fName:String, a:String, ids:Int  ){
        
    	// fields => properties
    	var firstName:String
    	var address:String
   		var id:Int 
   
    	// constructors
    	init{
        	firstName = fName
        	address = a
        	id = ids
    	}
    
   	 	// methods (fucntions) => behavior
    	fun changeAddress( newAddress:String ){
        	address = newAddress
    	}
    
    	fun displayStudentInfo(){
        	println("Name of student " + firstName)
        	println("Address of student " + address)
        	println("The ID of the student is " + id)
            
            // the following is possible because Student is an "inner class"
            println("The garage for GWCC is " + garage + "\n\n")
    	}   
	}
}
    

fun main(args: Array<String>) {
    
    // example instantiating an "inner" class"
	var s1 = GWCCPerson().Student( "moe", "333 niceView dr", 9887 )
    s1.displayStudentInfo()
    
    // example instantiating an "inner" class"
    var p1 = GWCCPerson()
    println("The garage for GWCC is "+ p1.garage)    
}