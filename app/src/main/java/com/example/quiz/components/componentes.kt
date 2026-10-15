package com.example.quiz.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.quiz.R

@Composable
fun IconJogo(
    largura: Dp,
    altura: Dp,
    modifier: Modifier = Modifier
){
    Image(
        modifier = modifier.width(largura).height(altura),
        painter = painterResource(R.drawable.quiz),
        contentDescription = "Quiz"
    )
}

@Composable
fun Texto(texto: String, tamanho: TextUnit){
    Text(
        text = texto,
        color = Color.Black,
        fontSize = tamanho
    )
}

@Composable
fun Botao(
    texto: String,
    color: Color,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
){
    Button(
        modifier = Modifier
            .width(250.dp)
            .height(45.dp),
        colors = ButtonDefaults.buttonColors(containerColor = color),
        onClick = onClick
    ){
        Text(
            text = texto,
            color = Color(0xFF000000))
    }
}

@Composable
fun Cards(
    pergunta: String,
    alternativas: List<String>,
    respostaCorreta: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier
            .height(400.dp)
            .width(400.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFFFFFFF)
        )
    ) {
        Text(
            text = pergunta
        )

        alternativas.forEach { alternativa ->
            Botao(
                texto = alternativa,
                color = Color(0xFFFFFFFF),
                onClick = { onClick() }
            )
        }
    }
}