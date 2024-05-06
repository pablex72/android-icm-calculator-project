package com.aristidevs.androidmaster.sintaxis
//variables
fun main(){
    println("Hola Mundo")
    val name = "AristiDevs"
    //int
    val age:Int = 30;

    val charExample:Char = 'r'  //CONSTANTE
    var charExample2:Char = '@'   //VARIABLE
    //String
    val stringExample:String = "aqui"

    val booleanExample:Boolean = false
    var transformame:Int = 43.5f.toInt()
    println("hola mi edad es $age")
    println("transfor "+transformame)
    println(stringExample)
    println(age+1)
    println(age%2)
    variablesNumericas()
    showMyName("pablito")
    showMyAge(26)
    add(25,76)
    val mySubtract = subtract(10,5)
    println(mySubtract)
}

fun variablesNumericas(){
    println("estoy dentro de la funcion")
}

fun showMyName(name:String){
    println("Me llamo $name")
}

fun showMyAge(currentAge:Int){
    println("my age is $currentAge in showMyAge funcio")
}

fun add(firstNumber:Int, secondNumber:Int){
    println(firstNumber + secondNumber)
}

//valor de entrada por defecto
fun newAge(newAge:Int=5):Int{
    return newAge+2
}

/**
 * Diversas formas de expresar una funcion
 */
//funcino con parametro de salida
fun subtract(firstNumber: Int,secondNumber: Int):Int{
    return firstNumber - secondNumber
}
fun subtractCool(firstNumber: Int, secondNumber: Int):Int = firstNumber - secondNumber
fun subtractCool2(firstNumber: Int, secondNumber: Int) = firstNumber - secondNumber
