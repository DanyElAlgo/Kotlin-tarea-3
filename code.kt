fun saludar(nombre: String, saludo: String = "Hola"){
    println(saludo + ", " + nombre)
}

fun generar(genero: String): String {
    return "Mi género es ${genero}"
}

fun main(){
    val nombres: String = "Daniel Roland"
    val generos: List<String> = listOf("Masculino", "Femenino", "Personalizado", "Prefiero no decirlo")
    
    saludar(nombres) // Hola, Daniel Roland
    println(generar(generos[0])) // Mi género es Masculino
}