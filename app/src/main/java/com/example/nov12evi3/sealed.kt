package com.example.nov11evi2.clasesellada

// Clases selladas. Son utiles para agregar nuevas clases, sin tener que modificar la clase principal.
// La nueva clase puede heredar la clase sellada (sealed) sin necesidad de modificar clase principal.
sealed class sealed {
    class MensajeAlerta(val mensaje:String): sealed()
    class MensajeToast(val mensaje:String): sealed()
}

fun main(){
    var alerta = sealed.MensajeAlerta("Esto es una alerta")
    var toast = sealed.MensajeToast("Esto es un mensaje")
}