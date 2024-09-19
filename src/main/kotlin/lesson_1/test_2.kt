package org.example.lesson_1.test_2

var countOrder:Int = 75
val notificationOrderCliens:String = """
    | Спасибо за ваш заказ. 
    | Мы прилагаем все усилия, 
    | чтобы доставить его вам!
""".trimMargin()

var countWorker:Int = 2000
    get() = field
    set(value){
        if(value >= 0) field = value
    }


fun PlaceAnOrder(){
    println(notificationOrderCliens)
    countOrder++
}

fun main(){
    println("""
        |[1]Количество оформленных заказов: $countOrder
        |[2]Благодарственное сообщение:
        |$notificationOrderCliens   
    """.trimMargin())
    //println("Количество работников данного интернет-магазина: $countWorker")
    //Предположим что уволил один сотрудник
    countWorker--
    println("Количество работников данного интернет-магазина: $countWorker")
}

