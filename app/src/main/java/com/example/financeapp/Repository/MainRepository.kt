package com.example.financeapp.Repository

import com.example.financeapp.Domain.ExpenseDomain

class MainRepository {
    val items = mutableListOf(
        ExpenseDomain("Restaurants", 357.15,"img1","jun 2025 19:15"),
        ExpenseDomain("Restaurants", 357.15,"img2","16 jun 2025 13:57"),
        ExpenseDomain("Restaurants", 357.15,"img3","16 jun 2025 20:45"),
        ExpenseDomain("Restaurants", 357.15,"img1","15 jun 2025 22:18")
    )
}