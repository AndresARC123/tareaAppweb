package com.example.practicaparaclaseskotlin

fun main() {
    /*
    val variable:variables=variables();
    val arreglos:arrays=arrays()
    variable.ejemplo1();
    println("El cuadrado de 55.2 es : ${variable.cuadrado(valor=55.2F)}")

    arreglos.ejemploCalificaciones()

     */
    /*val analizador = AnalizadorCalificaciones()
    analizador.Captura()
    analizador.Imprimir()*/
    val agenda = Agenda()
    do {
        println("1. Añadir contacto")
        println("2. Mostrar contactos")
        println("3. Buscar Contacto")
        println("4. Salir")

        var opcion: Int = readln().toInt()

        when (opcion) {
            1 -> {
                println("Ingrese el nombre del contacto: ")
                val nombre = readln()
                println("Ingrese el telefono del contacto: ")
                val telefono = readln()
                agenda.agregarContacto(nombre, telefono)
            }

            2 -> agenda.mostrarTodosLosContactos()

            3 -> {
                print("Ingrese el nombre a buscar: ")
                val nombre = readln()
                val contacto = agenda.buscarContacto(nombre)
                if (contacto != null) {
                    println("Contacto encontrado: Nombre: ${contacto.nombre} - Teléfono: ${contacto.numero}")
                } else {
                    println("No se encontro el contacto.")
                }
            }

            4 -> println("Saliendo")

            else -> println("Opcion inválida")
        }

    } while (opcion != 4)
}
