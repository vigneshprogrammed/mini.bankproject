class Account(var name: String, val number: Int) {
    var balance: Double = 0.0;
    val transactions = mutableListOf<Double>();

    companion object {
        var ac : Account? = null
    }

    fun deposit(amount: Double) {
        if (amount > 0) {
            transactions.add(amount)
            balance += amount
        } else {
            println("The amount is negative")
        }
    }

    fun withdraw(amount: Double) {
        if ((-amount) < 0 && amount <= balance) {
            transactions.add(-amount)
            balance -= amount
        } else {
            println("The amount is negative")
        }
    }

    fun checkBalance() {
        this.balance = 0.0
        transactions.forEach {
            this.balance += it
        }
        println("Your balance is $balance")
    }

    fun showTransactions() {
        transactions.forEach {
            if (it > 0) {
                println("Deposited $it")
            } else {
                println("Withdrawed $it")
            }
        }
    }
}