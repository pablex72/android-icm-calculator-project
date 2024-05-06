package com.aristidevs.androidmaster.sintaxis

fun main(){
//    var name:String[] = {"juan","pepe","lucho"};
    val weekDays = arrayOf("Lunes","Martes","Miercoles")
    println(weekDays[0])
    //bucles para arrays
//    for (index:Int,index<weekDays.size,index++){
//    }
    for (position in weekDays.indices){
        println("He pasado por aqui $position")
        println(weekDays[position])
    }
    for ((position,value) in weekDays.withIndex()){
        println("la posicion $position, contiene $value")
    }
    for (weekDay in weekDays){
        println("ahora es $weekDay")
    }
}