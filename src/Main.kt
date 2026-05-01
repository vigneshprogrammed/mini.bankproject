import kotlin.system.exitProcess

fun main() {
    header("Welcome to the Bank :)")
    provideOptions()
}

fun header(msg: String) {
    println("x-------------------------------------x")
    println("x               XYZ Bank              x")
    println("x            *Cash is world*          x")
    println("x-------------------------------------x")
    println("x    Ad: No. 4/873, Mogappair West    x")
    println("x              Chennai - 37           x")
    println("x-------------------------------------x")
    println("x  Ph: 8754418640 | Em: xyz@bank.com  x")
    println("x-------------------------------------x")
    println("\n$msg")
}

fun provideOptions() {
    println()
    println("Select Options")
    println("\t1.\tCreate A/c")
    println("\t2.\tDelete A/c")
    println("\t3.\tAlter A/c")
    println("\t4.\tCheck Balance")
    println("\t5.\tDeposit")
    println("\t6.\tWithdrawl")
    println("\t7.\tTransactions")
    println("\t8.\tExit")

    print("\nYour option is: ")
    val opt: Int = readln().toInt()

    println()

    when (opt) {
        1 -> {
            println("Selected option is: 1 -> Create A/c")
            print("\nEnter your desired A/c name: ")
            val name: String = readln().toString()
            print("\nEnter your desired A/c number: ")
            val number: Int = readln().toInt()
            Account.ac = Account(name, number)
            provideOptions()
        }
        2 -> {
            println("Selected option is: 2 -> Delete A/c")
            Account.ac = null
            print("\nAccount deleted successfully!")
            provideOptions()
        }
        3 -> {
            println("Selected option is: 3 -> Alter A/c")
            print("\nEnter your desired A/c name: ")
            val name: String = readln().toString()
            Account.ac?.name = name
            provideOptions()
        }
        4 -> {
            println("Selected option is: 4 -> Check Balance")
            Account.ac?.checkBalance()
            provideOptions()
        }
        5 -> {
            println("Selected option is: 5 -> Deposit")
            print("\nEnter your amount: ")
            val amount: Double = readln().toDouble()
            Account.ac?.deposit(amount)
            provideOptions()
        }
        6 -> {
            println("Selected option is: 6 -> Withdrawl")
            print("\nEnter your amount: ")
            val amount: Double = readln().toDouble()
            Account.ac?.withdraw(amount)
            provideOptions()
        }
        7 -> {
            println("Selected option is: 7 -> Transactions")
            print("\nThe transaction done are:")
            Account.ac?.showTransactions()
            provideOptions()
        }
        else -> {
            println("Selected option is: 8 -> Exit")
            exitProcess(0)
        }
    }
}