class RepositorioCompras {
    private val compras: MutableList<Compra> = mutableListOf()

    fun agregarCompra(compra: Compra) {
        compras.add(compra)
    }


    fun domicilios() {
        val setCompras: MutableSet<Domicilio> = mutableSetOf()
        for ((i, compra) in compras.withIndex()) {
            setCompras.add(compra.cliente.domicilio)
        }

        for ((i, domicilio) in setCompras.withIndex()) {
            println("Domicilio ${i + 1}: ${domicilio.dirCompleta()}")
        }
    }
}