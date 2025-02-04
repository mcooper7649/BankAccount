package com.mycodedojo.bankaccountprogram

fun main(){
    val mikesBankAccount = BankAccount("Mike Cooper", 1222.22)
    mikesBankAccount.deposit(200.0)
    mikesBankAccount.displayTransactions()
    mikesBankAccount.withdraw(200.0)
    mikesBankAccount.deposit(200.0)
    mikesBankAccount.withdraw(120.0)

    mikesBankAccount.deposit(122.00 )

    mikesBankAccount.displayTransactions()

    println("${mikesBankAccount.accountHolder}'s " + "balance is ${mikesBankAccount.acctBalance()}")

    val sarahsBankAccount = BankAccount("Sarah", 0.00)

    sarahsBankAccount.deposit(100.0 )
    sarahsBankAccount.withdraw(10.0 )
    sarahsBankAccount.deposit(300.0)

    println("${sarahsBankAccount.acctBalance()} is sarahs balance.")
}