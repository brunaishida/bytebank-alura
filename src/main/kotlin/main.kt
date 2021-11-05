fun main() {
    val titular = "Alex"
    val conta = 1000
    var saldo = 0.0
    saldo += 300 + 2.0

    println("Bem Vindo ao ByteBank")
    println("titular $titular")
    println("número da conta $conta")
    println("saldo da conta $saldo")

    testaCondicao(saldo)
}

fun testaCondicao(saldo: Double) {
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}