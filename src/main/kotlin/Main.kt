import kotlin.math.*

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

    //suma
    println(2+2)
    //resta
    println(2-2)
    //división
    println(2/2)
    //modulos
    println(2%2)
    //multiplicación
    println(2*2)
    //Operacion Matematica
    println(1 + (9 / 3) * 2)
    //potencia
    println(2.0.pow(2))

    //Comparacion e igualdad operadores
    //igualdad
    println(2==2)
    //Desigualdad / Diferencia
    println(2!=2)
    //mayor que
    println(2>2)
    //menor que
    println(2<2)
    //mayor o igual que
    println(2>=2)
    //menor o igual que
    println(2<=2)

    var anyNumber: Int = 0

    anyNumber += 10
    anyNumber -= 2
    anyNumber *= 2
    anyNumber /= 2
    anyNumber %= 2
    anyNumber++
    anyNumber--
    println(anyNumber)

    var isTrue: Boolean = true
    var isFalse: Boolean = false
    //Operadores Booleanos logicos
    //AND
    println(isTrue && isFalse)
    //OR
    println(isTrue || isFalse)
    //NOT
    println(!isTrue)
    helloWorld()
    var myNumber: Int = dobleTheValue(2)
    println(myNumber)
    favoriteFoodPrompot("Daniel", "Sushi")
    favoriteFoodPrompot()
}

fun helloWorld(){
    println("Hello World")
}

fun dobleTheValue(numberValue: Int): Int{
    return numberValue * 2
}

fun favoriteFoodPrompot(name: String = "Anonymus", favoriteFood: String = "Pizza"): Unit {
    println("$name s favorite food is $favoriteFood")
}