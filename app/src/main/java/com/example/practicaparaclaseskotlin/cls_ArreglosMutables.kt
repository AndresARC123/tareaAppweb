package com.example.practicaparaclaseskotlin

class cls_ArreglosMutables {
    var Calificaciones=mutableListOf<Float>();

    fun Captura(){
        println("Ingresa tus calificaciones")
        for(i in 0..8){
            println("Captura la calificacion ${i}: ")
            val cal:Float=readln().toFloat()
            Calificaciones.add(cal)
        }
    }
    fun Imprimir(){
        println("Las calificaciones capturadas son:")
        for(i in 0..7){
            println("La calificacion ${i} es ${Calificaciones[i-1]}")
        }
    }
}