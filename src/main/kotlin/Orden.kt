package lab2

import lab2.CustomList

class Orden {
    var nombre: String
    var pupusas = CustomList();

    fun añadir(tipo: String) {
        pupusas.añadir(tipo)
    }

    override fun toString() {
        print("${nombre}: ")
        pupusas.toString()
    }
}