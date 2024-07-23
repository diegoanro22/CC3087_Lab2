package com.example.lab_2

class MainActivity {

    fun main() {

        var numeros = listOf(14, 12, 45, 23, 18, 11, 89, 32, 56, 27)

        // Función Promedio
        val promedio = calcularPromedio(numeros)
        println("Números: $numeros")
        println("El promedio de los números es: $promedio")
        println(numeros.average())

        //Funcion extraer números impares
        val numerosImpares = obtenerNumerosImpares(numeros)
        println("Números impares: $numerosImpares")

        //Funcion para saber si es Palindromo
        var cadena = "reconocer"
        val resultado = esPalindromo(cadena)?.let { "Es palíndromo" } ?: "No es palíndromo"
        println("$cadena $resultado")


        //Funcion para agregar un saludo
        var nombres = listOf("Juan", "Maria", "Pedro", "Ana", "Carlos")
        println(agregarSaludo(nombres))


        //Operaciones con Lambda
        val suma = performOperation(5, 3) { a, b -> a + b }
        println("Suma: $suma")
        val resta = performOperation(10, 7) { a, b -> a - b }
        println("Resta: $resta")





    }

    fun calcularPromedio(numeros: List<Int>) : Int {
        return numeros.reduce { acc, n -> acc + n } / numeros.size
    }

    fun obtenerNumerosImpares(numeros: List<Int>) : List<Int> {
        return numeros.filter { it % 2 != 0 }
    }

    fun esPalindromo(cadena: String): Boolean {
        val cadenaInvertida = cadena.reversed()
        return cadena == cadenaInvertida
    }

    fun agregarSaludo(nombres: List<String>) : List<String> {
        return nombres.map { "Hola $it" }
    }

    fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }




}