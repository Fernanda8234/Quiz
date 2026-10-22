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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.quiz.components.Botao
import com.example.quiz.components.IconJogo
import com.example.quiz.components.Pergunta
import com.example.quiz.components.Texto

@Composable
fun TelaResultadoScreen(
    nomeJogador: String,
    acertos: Int,
    total: Int,
    aoReiniciar: () -> Unit,
    modifier: Modifier = Modifier,
    navController: NavController
){
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

            val mensagem = when (acertos) {
                0 -> "Poxa... tente de novo!"
                1 -> "Foi por pouco!"
                2 -> "Quase perfeito!"
                else -> "Você é fera! 🔥"
            }

            Pergunta(texto = mensagem)

            Spacer(modifier = Modifier.height(45.dp))

            Texto(
                texto = when {
                    nomeJogador.isNullOrBlank() -> "Você acertou $acertos de $total"
                    else -> "Você $nomeJogador acertou $acertos de $total"
                },
                tamanho = 20.sp
            )

            Spacer(modifier = Modifier.height(45.dp))

            Botao(
                texto = "JOGAR NOVAMENTE",
                color = Color(0xFFFEDF2F),
                alinhamentoTexto = TextAlign.Center,
                onClick = {
                    aoReiniciar()
                    navController.navigate("inicio")
                }
            )
        }
    }
}