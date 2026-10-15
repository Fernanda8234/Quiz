package com.example.quiz.telas

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
import com.example.quiz.components.Botao
import com.example.quiz.components.IconJogo

@Composable
fun TelaFinalScreen(modifier: Modifier = Modifier, navController: NavController){
    Box(
        modifier = modifier
        .background(Color(0xFF00CFFF))
        .fillMaxSize()
    ){
        Column(
            modifier = modifier
                .fillMaxSize(),
            //.background(Color(0xFFDAC9FF)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            IconJogo(100.dp, 100.dp)

            Spacer(modifier = Modifier.height(45.dp))

            Botao(
                texto = "JOGAR NOVAMENTE",
                color = Color(0xFFFFFF00),
                onClick = {navController.navigate("inicio")}
            )
        }
    }
}