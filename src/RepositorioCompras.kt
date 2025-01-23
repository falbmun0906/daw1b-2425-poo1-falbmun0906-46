class RepositorioCompras {
    private val compras: MutableList<Compra> = mutableListOf()

    fun agregarCompra(compra: Compra) {
        compras.add(compra)
    }

    fun agregarCompra(cliente: Cliente, dia: Int, monto: Double) {
        compras.add(Compra(cliente, dia, monto))
    }

    fun agregarCompra(nombre: String, calle: String, numero: Int, dia: Int, monto: Double) {
        val domicilio= Domicilio(calle, numero)
        val cliente= Cliente(nombre, domicilio)
        compras.add(Compra(cliente, dia, monto))
    }

    fun domicilios(): MutableSet<Domicilio> {
        val setCompras: MutableSet<Domicilio> = mutableSetOf()
        for (compra in compras) {
            setCompras.add(compra.cliente.domicilio)
        }
        return setCompras
    }
}