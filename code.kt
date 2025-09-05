fun main(){
    val nombres: String = "Daniel Roland"
    val apellidos: String = "Peñaranda Colque"
    val materia: String = "Aplicaciones Móviles"
    val peso: Double = 56.8 //Kg
    val altura: Double = 1.72 //Mts
    val edad: Int = 20
    val esPar: Boolean = edad%2==0
    val generos: List<String> = listOf("Masculino", "Femenino", "Personalizado", "Prefiero no decirlo")
        
    println("Hola! Soy ${nombres + ' ' + apellidos}.")
    println("Tengo ${edad} años ${if(esPar) "(par)" else "impar"}.")
    println("Mi peso es de ${peso}Kg. y mido ${altura}Mts.")
    println("Estoy estudiando ${materia} y mi género es ${generos[0]}.")
}