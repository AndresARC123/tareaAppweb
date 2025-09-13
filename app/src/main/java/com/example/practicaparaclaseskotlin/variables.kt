package com.example.practicaparaclaseskotlin
/*
Datos enteros Byte, Short, Int,Long
Datos flotantes Float, Double
Datos booleanos Boolean
Datos caracter Char
Cadenas de texto String

Mencionar que val es equivalentes a las constantes en c#
y var es eqqivale te a la variables en c#
 */
class variables {
    fun ejemplo1(){
        var score:Int=0;
        var miByte:Byte;
        val name:String="Garnol...";
        score+=100;
        //name="Chuyman...";
        println("Felicidades $name tu nuevo score es: $score");

    }
    fun cuadrado(valor:Float):Float{
        var res:Float=0.0F;
        res=valor*valor;
        return res;
    }
}