package com.example.quiz.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.quiz.components.Botao
import com.example.quiz.components.IconJogo
import com.example.quiz.components.Texto

@Composable
fun TelaInicialScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    aoConfirmarJogador: (String) -> Unit
){

    val outlinedTextFieldValue = remember {
        mutableStateOf("")
    }
    Box(
        modifier = modifier
            .background(Color(0xFF00CFFF))
            .fillMaxSize()
    ){
        Column(
            modifier = modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            IconJogo(100.dp, 100.dp)

            Spacer(modifier = Modifier.height(45.dp))

            Texto(
                texto = "QUIZATRON 3000",
                tamanho = 25.sp
            )

            Spacer(modifier = Modifier.height(25.dp))

            OutlinedTextField(
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color.Black,
                    unfocusedContainerColor = Color.White,
                    focusedContainerColor = Color.White
                ),
                value = outlinedTextFieldValue.value,
                onValueChange = { seuNome: String ->
                    outlinedTextFieldValue.value = seuNome
                    aoConfirmarJogador(seuNome)
                },
                placeholder = {
                    Texto(
                        texto = "Digite seu nome",
                        tamanho = 16.sp
                    )
                }
            )

            Spacer(modifier = Modifier.height(25.dp))

            Botao(
                texto = "COMEÇAR!",
                color = Color(0xFFFEDF2F),
                alinhamentoTexto = TextAlign.Center,
                onClick = {navController.navigate("quiz")}
            )
        }
    }
}