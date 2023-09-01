abstract class Conta(val cliente: String, var saldo: Double, val numero: String, val agencia: String) : Extrato {
    abstract fun depositar(valor: Double)
    abstract fun retirar(valor: Double)
    abstract fun transferir(destino: Conta, valor: Double)
}