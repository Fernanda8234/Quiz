package com.example.quiz.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
fun Pergunta(
    texto: String,
    modifier: Modifier = Modifier
){
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .background(Color(0xFF6FD7A4))
            .width(250.dp)
            .height(80.dp)
            .border(2.dp, Color.Black, RoundedCornerShape(12.dp)),
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(
            text = texto,
            color = Color.Black,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
fun Botao(
    texto: String,
    color: Color,
    alinhamento: TextAlign,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
){
    Button(
        modifier = Modifier
            .width(275.dp)
            .height(45.dp),
        colors = ButtonDefaults.buttonColors(containerColor = color),
        onClick = onClick,
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(2.dp, Color.Black),
    ){
        Text(
            text = texto,
            color = Color(0xFF000000),
            textAlign = alinhamento,
            modifier = Modifier.fillMaxWidth())
    }
}

@Composable
fun Cards(
    pergunta: String,
    alternativas: List<String>,
    respostaCorreta: String,
    onClick: (Boolean) -> Unit,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier
            .fillMaxWidth(0.8f)
            .fillMaxHeight(0.5f),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = pergunta,
                color = Color.Black
            )

            alternativas.forEach { alternativa ->
                Botao(
                    texto = alternativa,
                    color = Color.White,
                    alinhamento = TextAlign.Start,
                    onClick = { onClick(alternativa == respostaCorreta) }
                )
            }
        }
    }
}