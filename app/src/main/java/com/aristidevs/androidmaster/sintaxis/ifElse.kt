package com.aristidevs.androidmaster.sintaxis

fun main(){

    ifBasico()
    ifMultiple()
}

fun ifBasico(){
    val name = "Aris"
    if (name == "pepe"){
        println("oye la variable name es ARIS")
    }
}

//if multiple para evitar if anidados
fun ifMultiple(){
    var age = 18
    var parentPermission = false
    var imHappy = true

    if(age>=18 && parentPermission && imHappy){
        println("puedo tomar agua")
    }
}

/**
 * WHEN
 */