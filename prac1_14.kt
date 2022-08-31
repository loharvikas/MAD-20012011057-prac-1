open class Person(firstname:String,lastname:String){
    var age:Int=-1
    init{
        println("First Name:$firstname")
        println("Last Name:$lastname")
    }
    constructor(firstname: String,lastname: String,age:Int):this(firstname,lastname){
        this.age=age
        println("Age $age")
    }
}
class Student(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String):Person(firstname,lastname,age){
    var batch:String=""
    init{
        println("Branch $branch")
        println("Class $Class")
    }
    constructor(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String,batch:String):this(firstname,lastname,age,eno,branch,Class){
        this.batch=batch
        println("Batch $batch")
        println("--------------")
    }
}`
fun main(){
    var s1=Student("Arnab","Pal",20,20012011006,"CE","C","AB7")
    var s2=Student("Vikas","Lohar",20,20012011057,"CE","C","AB7")
    var s3=Student("Anish","Vakacharla",20,20012011017,"CE","A","AB2")
    var s4=Student("Thomas","Shalby",21,20012021011,"IT","B","AB5")
    var s5=Student("Daemon","Targayran",22,2001201050,"CE","C","AB7")
}
