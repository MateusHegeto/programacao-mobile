fun main() {
    val contas = mutableListOf(
        ContaCorrente("Homer Simpson", 2000.0, "0000123", "12"),
        ContaCorrente("Bart Simpson", 3000.0, "0000456", "34"),
        ContaPoupanca("Marge Simpson", 2000.0, "0000789", "56")
    )

    // Aplicando juros de 0,8% por 5 dias na ContaCorrente
   // (contas[0] as ContaCorrente).aplicarJuros(5)

    // Aplicando juros de 0,3% por 7 dias na ContaPoupanca
    (contas[2] as ContaPoupanca).aplicarJuros(7)

    // Imprimindo os extratos de todas as contas
    for (conta in contas) {
        conta.imprimirExtrato()
        println()
    }
}