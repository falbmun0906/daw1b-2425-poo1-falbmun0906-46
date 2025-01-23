/**
 * Clase Domicilio
 * @param calle calle del domicilio
 * @param numero numero del domicilio
 * @constructor Crea un domicilio con calle y numero
 */
data class Domicilio(val calle: String, val numero: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Domicilio) return false

        return calle == other.calle && numero == other.numero
    }

    override fun hashCode(): Int {
        var result = calle.hashCode()
        result = 31 * result + numero
        return result
    }

    fun dirCompleta(): String {
        return "$calle, $numero"
    }
}