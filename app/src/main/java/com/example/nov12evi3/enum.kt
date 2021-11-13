package com.example.nov12evi3

enum class State {
    IDLE, RUNNING, FINISHED
}

// IMPRIME DE ACUERDO AL ESTADO DEFINIDO EN LINEA 13
fun main() {
    val primerEstado = State.IDLE
    val sefundoEstado = State.RUNNING
    val tercerEstado = State.FINISHED

    val message = when (tercerEstado){
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)
}


