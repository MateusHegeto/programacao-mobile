class ContaPoupanca(cliente: String, saldo: Double, numero: String, agencia: String) :
    Conta(cliente, saldo, numero, agencia) {

    override fun depositar(valor: Double) {
        saldo += valor
    }

    override fun retirar(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        } else {
            println("Saldo insuficiente")
        }
    }

    override fun transferir(destino: Conta, valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
            destino.depositar(valor)
        } else {
            println("Saldo insuficiente para transferência")
        }
    }

    override fun imprimirExtrato() {
        println("** Conta Poupança **")
        println("Conta/Agencia..: $numero/$agencia")
        println("Cliente........: $cliente")
        println("Saldo..........: R$ $saldo")
    }

    fun aplicarJuros(dias: Int) {
        val taxaJuros = 0.003 // 0,3%
        saldo *= Math.pow(1.0 + taxaJuros, dias.toDouble())
    }
}