package com.example.practicaparaclaseskotlin

class Agenda {
    private val contactos = mutableListOf<Contacto>()
    fun agregarContacto(nombre: String, numero: String) {
        val nuevoContacto = Contacto(nombre, numero)
        contactos.add(nuevoContacto)
        println("Contacto agregado correctamente.")
    }


    fun mostrarTodosLosContactos() {
        if (contactos.isEmpty()) {
            println("No hay contactos en la agenda.")
        } else {
            var i = 1
            for (contacto in contactos) {
                println("$i. Nombre: ${contacto.nombre} - Teléfono: ${contacto.numero}")
                i++
            }
        }
    }

    fun buscarContacto(nombre: String): Contacto? {
        for (contacto in contactos) {
            if (contacto.nombre == nombre) {
                return contacto
            }
        }
        return null
    }
}