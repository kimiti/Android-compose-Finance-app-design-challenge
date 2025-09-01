package com.example.financeapp.Activities.DashboardActivity.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.financeapp.Domain.ExpenseDomain


@Composable
@Preview
fun MainScreenPreview(){
    val expenses = listOf(
        ExpenseDomain("Restaurants", 357.15,"img1","jun 2025 19:15"),
        ExpenseDomain("Restaurants", 357.15,"img2","16 jun 2025 13:57"),
        ExpenseDomain("Restaurants", 357.15,"img3","16 jun 2025 20:45"),
        ExpenseDomain("Restaurants", 357.15,"img1","15 jun 2025 22:18")
    )
    MainScreen(expenses = expenses)
}

@Composable
fun MainScreen(
    onCardClick: () -> Unit = {},
    expenses: List<ExpenseDomain>
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 70.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)) { }
    }
}