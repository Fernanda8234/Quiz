package com.example.quiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.quiz.screens.TelaInicialScreen
import com.example.quiz.screens.TelaQuiz1
import com.example.quiz.screens.TelaQuiz2
import com.example.quiz.screens.TelaQuiz3
import com.example.quiz.screens.TelaResultadoScreen
import com.example.quiz.ui.theme.QuizTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuizTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    val navController = rememberNavController()
                    var acertos by remember { mutableStateOf(0) }
                    var nomeJogador by remember { mutableStateOf("") }

                    NavHost(
                        navController = navController,
                        startDestination = "inicio"
                    ){
                        composable( route = "inicio" ){
                            acertos = 0
                            TelaInicialScreen(modifier = Modifier.padding(innerPadding), navController = navController, aoConfirmarJogador = { nome -> nomeJogador = nome})
                        }

                        composable("quiz") {
                            TelaQuiz1(navController = navController) { acertou ->
                                if (acertou) acertos++
                            }
                        }
                        composable("quiz2") {
                            TelaQuiz2(navController = navController) { acertou ->
                                if (acertou) acertos++
                            }
                        }
                        composable("quiz3") {
                            TelaQuiz3(navController = navController) { acertou ->
                                if (acertou) acertos++
                            }
                        }

                        composable("resultado") {
                            TelaResultadoScreen(nomeJogador = nomeJogador, acertos = acertos, total = 3, navController = navController, aoReiniciar = {
                                nomeJogador = ""
                            })
                        }
                    }
                }
            }
        }
    }
}