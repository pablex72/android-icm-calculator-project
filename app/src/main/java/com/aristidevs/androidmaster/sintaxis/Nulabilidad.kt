package com.aristidevs.androidmaster.sintaxis

fun main(){
//no -->    var name:String = "Aris"
    var name:String?= "Aris"

    // !!dice que no sera null
//    println(name!![3])
    println(name!![3])

    //si name no es nulo dame ese valor
    println(name?.get(3))

    //si name no es nulo dame ese valor
    //pero si lo es --> print
    println(name?.get(3) ?: "Es null cuidado")
}