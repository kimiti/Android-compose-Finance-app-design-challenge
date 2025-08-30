package com.example.financeapp.Activities.IntroActivity.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.financeapp.R

@Preview
@Composable
fun IntroScreen(onClick: () -> Unit = {}) {
    ConstraintLayout(modifier = Modifier.fillMaxWidth()) {
        val (img, btn, title) = createRefs()

        Image(painter = painterResource(R.drawable.intro_pic), contentDescription = null)
    }
}