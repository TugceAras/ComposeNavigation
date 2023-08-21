package com.tugcearas.composenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.tugcearas.composenavigation.navigation.route.detailRoute
import com.tugcearas.composenavigation.navigation.route.homeRoute

@Composable
fun SetupNavGraph(
    navController: NavHostController,
) {

    NavHost(navController = navController, startDestination = Screen.Home.route){

        homeRoute(navController)
        detailRoute(navController)

    }
}