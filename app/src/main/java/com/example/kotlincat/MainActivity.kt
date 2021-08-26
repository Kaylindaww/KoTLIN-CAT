package com.example.kotlincat

import android.accounts.Account
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    data class Description(
            var AccountName: String,
            var AccountBalance: Float,
            var Currency: String,
            var Transaction:String
    )
    data class Reference(
            var AccountName: String,
            var AccountBalance: Float,
            var Currency: String,
            var Transaction:String
    )
    data class Date(
            val AccountName: String,
            val AccountBalance: Float,
            val Currency: String,
            val Transaction:String
    )
    data class Amount(
            val AccountName: String,
            val AccountBalance: Float,
            val Currency: String,
            val Transaction:String
    )
    data class Transaction(
            val AccountName: String,
            val AccountBalance: Float,
            val Currency: String,
            val TransactionType:String

    )




    }

