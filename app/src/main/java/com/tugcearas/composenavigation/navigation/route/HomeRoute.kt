package com.tugcearas.composenavigation.navigation.route

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.tugcearas.composenavigation.presentation.home.HomeScreen
import com.tugcearas.composenavigation.navigation.Screen

fun NavGraphBuilder.homeRoute(
    navController: NavController
){
    // created fragment
    composable(Screen.Home.route){
        HomeScreen(navController)
    }
}