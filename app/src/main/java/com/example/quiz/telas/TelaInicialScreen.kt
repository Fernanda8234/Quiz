package com.example.quiz.telas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.quiz.components.BotaoJogo
import com.example.quiz.components.ImagemJogo

@Composable
fun TelaInicialScreen(
    modifier: Modifier = Modifier,
    navController: NavController
){
    Box(
        modifier = modifier
            .background(Color(0xFF00CFFF))
            .fillMaxSize()
    ){
        Column() {
            ImagemJogo()

            Text(
                text = "QUIZATRON 3000"
            )

            BotaoJogo(
                onClick = {navController.navigate("final")},
                texto = "COMEÇAR!"
            )
        }
    }
}