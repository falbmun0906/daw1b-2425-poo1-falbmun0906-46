/**
 * Clase Domicilio
 * @param calle calle del domicilio
 * @param numero numero del domicilio
 * @constructor Crea un domicilio con calle y numero
 */
data class Domicilio(val calle: String, val numero: Int) {

    fun dirCompleta(): String {
        return "$calle Nº $numero"
    }
}