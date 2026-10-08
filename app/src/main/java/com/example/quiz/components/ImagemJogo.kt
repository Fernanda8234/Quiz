package com.example.quiz.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.quiz.R

@Composable
fun ImagemJogo(modifier: Modifier = Modifier){
    Image(
        modifier = modifier.width(95.dp).height(95.dp),
        painter = painterResource(R.drawable.quiz),
        contentDescription = "Quiz"
    )
}