package com.example.financeapp.viewModel

import androidx.lifecycle.ViewModel
import com.example.financeapp.Repository.MainRepository

class MainViewModel(val repository: MainRepository): ViewModel() {
    constructor():this(MainRepository())

    fun loadData() = repository.items
}