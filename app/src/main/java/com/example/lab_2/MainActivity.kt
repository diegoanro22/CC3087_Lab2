package com.example.lab_2



    fun main() {

        var numeros = listOf(14, 12, 45, 23, 18, 11, 89, 32, 56, 27)

        // Función Promedio
        val promedio = calcularPromedio(numeros)
        println("Números: $numeros")
        println("El promedio de los números es: $promedio")

        //Funcion extraer números impares
        val numerosImpares = obtenerNumerosImpares(numeros)
        println("Números impares: $numerosImpares")

        //Funcion para saber si es Palindromo
        var cadena = "reconocer"
        val resultado = if (esPalindromo(cadena)) "es palíndromo" else "no es palíndromo"
        println("$cadena $resultado")


        //Funcion para agregar un saludo
        var nombres = listOf("Juan", "Maria", "Pedro", "Ana", "Carlos")
        println(agregarSaludo(nombres))


        //Operaciones con Lambda
        val suma = performOperation(5, 3) { a, b -> a + b }
        println("Suma: $suma")
        val resta = performOperation(10, 7) { a, b -> a - b }
        println("Resta: $resta")


        //Mapear objeto Person a Student
        val persons = listOf(Person("Juan", 25, "Male"),
            Person("Maria", 30, "Female"),
            Person("Pedro", 28, "Male"))

        val studentId = (1..100000).random().toString()
        val students = persons.map {personToStudent(it, studentId)  }
        students.forEach { student ->
            println("El estudiante: ${student.name} tiene ${student.age} años")
        }


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

    fun personToStudent(person: Person, studentId: String): Student {
        return Student(person.name, person.age, person.gender, studentId)
    }


