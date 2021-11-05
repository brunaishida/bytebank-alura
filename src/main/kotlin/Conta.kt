class Conta {
    var titular = ""
    var numero = 0
    private var saldo = 0.0

    fun addSaldo(valor: Double) {
        this.saldo += valor
    }

    fun depositar(valor: Double) {
        addSaldo(valor)
        println("R$ $valor depositado com sucesso!")
    }

    fun sacar(valor: Double) {
        if(possoSacar(valor)) {
            addSaldo(-valor)
            println("R$ $valor sacado com sucesso!")
        } else {
            println("Valor de saque maior do que o disponível")
        }
    }

    fun transferir(valor: Double, contaDestino: Conta) {
        if(possoSacar(valor)) {
            addSaldo(-valor)
            contaDestino.depositar(valor)
        } else {
            println("Valor de transferência maior do que o disponível")
        }
    }

    fun verificaSaldo() {
        println("Seu saldo é de: R$ ${this.saldo}")
    }

    private fun possoSacar(valor: Double): Boolean {
        return this.saldo >= valor
    }
}