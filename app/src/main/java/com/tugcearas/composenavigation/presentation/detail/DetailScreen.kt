package com.tugcearas.composenavigation.presentation.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.tugcearas.composenavigation.navigation.Screen

@Composable
fun DetailScreen(
    navController:NavController
) {
    Box(modifier = Modifier
        .fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = "Detail Screen",
                color = Color.Blue,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(bottom = 12.dp)
            )
            Button(
                onClick = {navController.navigate(Screen.Home.route)}
            ) {
                Text(
                    text = "Back",
                    color = Color.White,
                    fontSize = 16.sp
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun DetailScreenPreview(){
    DetailScreen(navController = rememberNavController())
}