package com.tugcearas.composenavigation.navigation.route

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.tugcearas.composenavigation.presentation.detail.DetailScreen
import com.tugcearas.composenavigation.navigation.Screen

fun NavGraphBuilder.detailRoute(
    navController: NavController
){
    composable(Screen.Detail.route){
        DetailScreen(navController)
    }
}