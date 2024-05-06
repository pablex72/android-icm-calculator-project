package com.aristidevs.androidmaster.sintaxis

fun main(){

    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)

}

fun printNotificationSummary(numberOfMessages:Int){
    if(numberOfMessages>99){
        println("you have 99+")
    }else(
        println("you have $numberOfMessages")
    )
}