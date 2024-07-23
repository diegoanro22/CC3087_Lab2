package com.example.lab_2

class MainActivity {

    fun main() {

        // Función Promedio
        val numeros = listOf(14, 12, 13, 15, 14)
        val promedio = calcularPromedio(numeros)
        println("El promedio de los números es: $promedio")
        println(numeros.average())

    }

    fun calcularPromedio(numeros: List<Int>) : Int {
        return numeros.reduce { acc, n -> acc + n } / numeros.size
    }



}