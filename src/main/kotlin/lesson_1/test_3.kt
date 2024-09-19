package org.example.lesson_1

fun main(){
    val year = 1961
    var hour = 9
    var minute = 7
    println("Время взлета:\n $year year\n $hour hour\n $minute minute\n")
    hour = 10
    minute = 55
    println("""
        |Время посадки
        |[$hour:${minute}]
    """.trimMargin())


}
