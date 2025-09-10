enum class Genero(){
    Male, Female, Custom, Hidden
}

data class Persona(
    val nombres: String,
    val peso: Double,
    val altura: Double,
    val edad: Int,
    val genero: Genero
){
    fun saludar(){
        println("Hola, soy ${nombres}!");
    }
    fun esMayor(){
        if(this.edad>=18){
            println("Soy mayor de edad");
        }
        else{
            throw Error("YOUR ACCOUNT IS BEING TERMINATED");
        }
    }
    fun generar(): String{
        when(genero){
            Genero.Male -> return "Género masculino";
            Genero.Female -> return "Género femenino";
            Genero.Custom -> return "Género personalizado";
            Genero.Hidden -> return "Prefiero no decirlo";
            // else -> return "Género desconocido";
        }
    }
}

fun main(){
    val Yo = Persona(
        nombres = "Daniel Penaranda",
        peso = 56.8,
        altura = 1.72,
        edad = 20,
        genero = Genero.Male
    )

    Yo.saludar();
    Yo.esMayor();
    println(Yo.generar());
}