package com.example.nov12evi3

fun main(){
    val nombres= listOf<String>("bla","ble","bli")
    for(aux in nombres){
        println("Nombre $aux")
    }

    println()


    var contador = 0
    while (nombres.size > contador){
        println(nombres[contador])
        contador++
    }

    println()

    var contadorwhile = 0
    do{
        println("Nombre : ${nombres[contadorwhile]}, es un do while")
        contadorwhile++
    }while (nombres.size > contadorwhile)

}



