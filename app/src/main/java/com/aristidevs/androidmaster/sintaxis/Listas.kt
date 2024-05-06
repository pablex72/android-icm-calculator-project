package com.aristidevs.androidmaster.sintaxis

fun main(){
//    inmutableList()
    mutableList()
}
fun mutableList(){
    var weekDays:MutableList<String> = mutableListOf("Lunes", "Martes","Miercoles","Jueves", "Viernes")
    println(weekDays)
    weekDays.add(0,"AristiDay") // se add uno en la posicino no reemplaza
    println(weekDays)
    if (weekDays.isEmpty()){
        //no pintare nada porque no hay
    }else{
        weekDays.forEach { println(it)}
    }

    for (item in weekDays){
        println(item)
    }

}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes", "Martes","Miercoles","Jueves")
    println(readOnly)
    println(readOnly.size)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())
    val example = readOnly.filter { it.contains("a")  }
    println(example)
    readOnly.forEach{ weekDay -> println(weekDay) } // =     readOnly.forEach{ println(it) }

}
