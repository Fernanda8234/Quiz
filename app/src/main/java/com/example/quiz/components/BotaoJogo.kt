package com.example.quiz.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BotaoJogo(modifier: Modifier = Modifier, texto: String, onClick: () -> Unit){
    Button(
        modifier = Modifier
            .width(250.dp)
            .height(45.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFFF00)),
        onClick = onClick
    ){
        Text(
            text = texto,
            color = Color(0xFF000000),)
    }
}