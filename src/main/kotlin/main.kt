fun main() {
    val contaAlex = Conta("Alex", 1000)
    contaAlex.addSaldo(200.0)

    println("Bem Vindo ao ByteBank")
    println("titular ${contaAlex.titular}")
    println("número da conta ${contaAlex.numero}")
    contaAlex.verificaSaldo()

    contaAlex.depositar(200.0)
    contaAlex.sacar(100.0)
    contaAlex.sacar(10000000.0)

    val contaBob = Conta("Bob", 1001)
    contaBob.addSaldo(100.0)


    contaAlex.transferir(100.0, contaBob)
    contaAlex.transferir(10000000.0, contaBob)
}

