package com.example.quiz.telas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.quiz.components.BotaoJogo
import com.example.quiz.components.ImagemJogo

@Composable
fun TelaFinalScreen(modifier: Modifier = Modifier, navController: NavController){
    Box(
        modifier = modifier
        .background(Color(0xFF00CFFF))
        .fillMaxSize()
    ){
        ImagemJogo()

        BotaoJogo(
            onClick = {navController.navigate("inicio")},
            texto = "JOGAR NOVAMENTE"
        )
    }
}