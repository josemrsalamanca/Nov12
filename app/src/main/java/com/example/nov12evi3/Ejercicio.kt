package com.example.nov12evi3

fun main(){
    miNombreEs("Jose","Ramirez")
    println()

    sumar(10,20,30)
    println()

    stringchar('a',"palabra")
    println()

    floatt()
    println()

    maximoByte()
    println()
    minimoIntLong()

    println()
    imprimiendo("hola","chao")

    println()
    obtieneIva(1000000,19)

}

//2
fun miNombreEs(nombre:String, apellido:String){
    println("Mi nombre es $nombre $apellido")
}

//3
fun sumar(num1:Int, num2:Int, num3:Int){
    val resul = num1+num2+num3
    println("La suma de $num1 + $num2 + $num3= $resul")
}

//4 y 5
fun stringchar(var1 : Char, var2 : String){
    println("La variable: $var1, es tipo Char y la variable; $var2, es tipo String")
    var var1= 'b'
    println("El nuevo valor de la variable char es $var1")
    println("El largo de la variable String es: ${var2.length}")
}

//6
fun floatt(){
    var flotante = 20.6f
    println(flotante)
}

//8
fun maximoByte(){
    val maxByte = Byte.MAX_VALUE
    val maxShort = Short.MAX_VALUE
    println("$maxByte")
    println("$maxShort")

}
//9
fun minimoIntLong(){
    val minLong = Long.MIN_VALUE
    val minInt = Long.MIN_VALUE
    println("$minLong")
    println("$minInt")
}

//10
fun imprimiendo(param1: String, param2: String){
    val largo1 = param1.length
    val largo2 =param2.length
    val total = largo1 + largo2
    println("El total de caracteres de ambas palabras es: ${total}")
}

fun obtieneIva( monto:Int,iva:Int){
    val Taxes = (monto*iva)/100
    println("El IVA del monto es: $Taxes")
}