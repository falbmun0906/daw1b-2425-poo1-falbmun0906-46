fun main() {
    val listaCompras: List<List<Any>> = listOf(
        listOf("Nuria Costa", 5, 12780.78, "Calle Las Flores 355"),
        listOf("Jorge Russo", 7, 699, "Mirasol 218"),
        listOf("Nuria Costa", 7, 532.90, "Calle Las Flores 355"),
        listOf("Julián Rodriguez", 12, 5715.99, "La Mancha 761"),
        listOf("Jorge Russo", 15, 958, "Mirasol 218"))

    val repositorioCompras: RepositorioCompras = RepositorioCompras()
    for (compra in listaCompras) {
        val numero: Int = (compra[3].toString().split(" ").last().toInt())
        val calle: String = (compra[3] as String).split(" ").dropLast(1).joinToString(" ")
        val domicilio: Domicilio = Domicilio(calle, numero)
        val cliente: Cliente = Cliente(compra[0] as String, domicilio)
        val diaMes: Int = compra[1].toString().toInt()
        val monto: Double = compra[2].toString().toDouble()

        repositorioCompras.agregarCompra(Compra(cliente, diaMes, monto))
    }
    repositorioCompras.domicilios()
}