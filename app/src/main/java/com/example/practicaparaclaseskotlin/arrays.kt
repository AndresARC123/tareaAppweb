package com.example.practicaparaclaseskotlin

class arrays {
    fun ejemploCalificaciones(){
        var calificaciones: List<Int>
        calificaciones=listOf(10,9,5,7,8,8,9)
        println("La primer calificacion es : ${calificaciones[0]}")

        println("Imprimiendo el Array...")
        //estructura de for en c# for(int i=0; i<final; i++)
        //Definimoos un contador
        var x:Int=1;
        for (c in calificaciones){
            println("La calificacion ${x} es : ${c}")
            x++;
        }

    }
}