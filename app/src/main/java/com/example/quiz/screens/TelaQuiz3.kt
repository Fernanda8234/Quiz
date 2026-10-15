package com.example.quiz.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.quiz.components.Cards
import com.example.quiz.components.IconJogo
import com.example.quiz.components.Pergunta

@Composable
fun TelaQuiz3(
    modifier: Modifier = Modifier,
    navController: NavController,
    aoResponder: (Boolean) -> Unit
){
    Box(
        modifier = modifier
            .background(Color(0xFFAF7FEE))
            .fillMaxSize()
    ){
        Column(
            modifier = modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            IconJogo(65.dp, 65.dp)

            Spacer(modifier = Modifier.height(25.dp))

            Pergunta(
                texto = "Pergunta 3"
            )

            Spacer(modifier = Modifier.height(25.dp))

            Cards(
                pergunta = "Qual é o animal terrestre mais rápido do mundo?",
                alternativas = listOf("Leão", "Guepardo", "Cavalo", "Antílope"),
                respostaCorreta = "Guepardo",
                onClick = {
                    acertou ->
                    aoResponder(acertou)
                    navController.navigate("resultado")
                }
            )
        }
    }
}