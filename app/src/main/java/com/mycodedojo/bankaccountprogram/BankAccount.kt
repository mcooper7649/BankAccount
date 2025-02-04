package com.mycodedojo.bankaccountprogram

class BankAccount(var accountHolder:String, var balance: Double) {
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double){
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }

    fun withdraw (amount: Double){
        if(amount <= balance){
            // we can withdraw
             balance -= amount
            transactionHistory.add("$accountHolder withdrew $$amount")
        }else {
            println("you don't have the funds to withdraw $$amount")
        }
    }

    fun displayTransactions(){
        println("Transaction history for $accountHolder")
        for (transaction in transactionHistory){
            println(transaction)
        }
    }

    fun acctBalance(): Double{
        return balance
    }
}