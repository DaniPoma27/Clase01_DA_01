fun main(){
    //Boolean size 1bit false/true
    //Byte size 8bit -127 to -128
    //Char size 16bit 'a' to 'z' '/n' '/101'
    //Double size 64bit 3.4d
    //Float size 32bit 3.4f
    //Int size 32bit -2, -1, 0, 1, 2
    //Long size 64bit -2L, -1L, 0L, 1L, 2L
    //Short size 16bit none
    val dayOfBirth: Int = 20
    val monthOfBirch: Int = 1
    println("My birthday is $dayOfBirth/$monthOfBirch")
    println("My birthday is: " + dayOfBirth + "/" + monthOfBirch)
    var name : String = "Daniel"
    var lastName : String = "Soto"
    println("My name is ${name.uppercase()} ${lastName.lowercase()}")
    println("My name is: "+ name + " " + lastName)
    name = "Pedro"
    println("My name is $name $lastName")

}