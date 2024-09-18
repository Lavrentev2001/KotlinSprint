package org.example.lesson_1

var countOrder:Int = 75
val notificationOrderCliens:String = """
    | Спасибо за ваш заказ. 
    | Мы прилагаем все усилия, 
    | чтобы доставить его вам!
""".trimMargin()

//place an order
fun PlaceAnOrder(){
    println(notificationOrderCliens)
    countOrder++
}

fun main(){
    PlaceAnOrder()
}

