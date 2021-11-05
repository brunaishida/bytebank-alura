fun main() {
    val conta = Conta()
    conta.titular = "Alex"
    conta.numero = 1000
    conta.saldo = 200.0

    println("Bem Vindo ao ByteBank")
    println("titular ${conta.titular}")
    println("número da conta ${conta.numero}")
    println("saldo da conta ${conta.saldo}")

    testaCondicao(conta.saldo)
}

fun testaCondicao(saldo: Double) {
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}
