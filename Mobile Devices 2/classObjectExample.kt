
// Declaration of the class Student
 class Student( fName:String, a:String, ids:Int  ){
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
    }
    
}

fun main(args: Array<String>) {
// creating an object (i.e. s1) from the class Student
    var s1 = Student( "joe", "333 niceView dr", 9887 )
    s1.displayStudentInfo()
    s1.changeAddress( "333 evenANicerView" )
    s1.displayStudentInfo()

    
    
} 