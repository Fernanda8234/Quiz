package com.example.quiz.telas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.quiz.components.Cards
import com.example.quiz.components.Texto

@Composable
fun TelaQuiz1(
    modifier: Modifier = Modifier,
    navController: NavController
){
    Box(
        modifier = modifier
            .background(Color(239, 151, 207))
            .fillMaxSize()
    ){
        Column(
            modifier = modifier
                .fillMaxSize(),
            //.background(Color(0xFFDAC9FF)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Texto(
                texto = "Pergunta 1",
                tamanho = 20.sp
            )

            Cards(
                pergunta = "Qual é a capital da França?",
                alternativas = listOf("Londres", "Berlin", "Paris", "Madri"),
                respostaCorreta = "Paris",
                onClick = {
                        navController.navigate("quiz2")
                }
            )
        }
    }
}