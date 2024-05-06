package com.aristidevs.androidmaster.sintaxis

fun main(){
    getMonth(3)
    result("soy string en WHEN")
    getTrimestre(2)
}

fun getMonth(month:Int){
    if(month==1){
        println("enero")
    }
    else if(month ==2){
        println("febrero")
    }else if(month ==3){
        println("marzo")
    }else{
        println("el mes no existe")
    }
}

fun getMonthWhen(month: Int){
    when(month){
        1 -> println("enero")
        2 -> println("febrero")
        3 -> println("marzo")
        4 -> println("abril")
        5 -> println("mayo")
        6 -> {
            println("junio")
            println("junio")
        }
        else -> println("no es valido")

    }
}

fun getTrimestre(month: Int){
    when(month){
        in 1..3 -> print("Primer TTRIMESTRE")
        4,5,6 -> print("SEgundo TTRIMESTRE")
        7,8,9 -> print("tercero TTRIMESTRE")
        !in 10..15 -> println("semestre out")
        else -> println("no valdo")
    }
}

fun getTrimestresTRING(month: Int):String{
    val result = when(month){
        in 1..3 -> "Primer TTRIMESTRE"
        4,5,6 -> "SEgundo TTRIMESTRE"
        7,8,9 -> "tercero TTRIMESTRE"
        !in 10..15 ->"semestre out"
        else -> "no valdo"
    }
    return result
}

fun getTrimestresTRING2(month: Int):String{
    return when(month){
        in 1..3 -> "Primer TTRIMESTRE"
        4,5,6 -> "SEgundo TTRIMESTRE"
        7,8,9 -> "tercero TTRIMESTRE"
        !in 10..15 ->"semestre out"
        else -> "no valdo"
    }
}

fun getTrimestresTRING3(month: Int) =
    when(month){
        in 1..3 -> "Primer TTRIMESTRE"
        4,5,6 -> "SEgundo TTRIMESTRE"
        7,8,9 -> "tercero TTRIMESTRE"
        !in 10..15 ->"semestre out"
        else -> "no valdo"
}

fun result(value: Any){
    when(value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if(value) print("holiwi")
    }
}