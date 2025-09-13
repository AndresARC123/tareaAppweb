package com.example.practicaparaclaseskotlin

class AnalizadorCalificaciones {
    var Calificaciones = mutableListOf<Float>()

    fun Captura() {
        println("Ingresa tus calificaciones")
        for (i in 1..7) {
            println("Captura la calificacion ${i}: ")
            val cal: Float = readln().toFloat()
            Calificaciones.add(cal)
        }
    }

    fun Imprimir() {
        println("Las calificaciones capturadas son:")
        var suma: Float = 0f

        for (i in Calificaciones.indices) {
            println("La calificacion ${i + 1} es ${Calificaciones[i]}")
            suma += Calificaciones[i]
        }

        val prom: Float = suma / Calificaciones.size
        val aprobadas = Calificaciones.count { it >= 7 }
        val reprobadas = Calificaciones.count { it < 7 }
        val maxima = Calificaciones.maxOrNull()
        val minima = Calificaciones.minOrNull()

        println("El promedio es: $prom")
        println("Materias aprobadas: $aprobadas")
        println("Materias reprobadas: $reprobadas")
        println("Calificacion mas alta: $maxima")
        println("Calificacion mas baja: $minima")
    }
}


