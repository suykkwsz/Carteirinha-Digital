package com.senai.carteirinhadigital.app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.Login
    ) {
        authScreen(
            onNavigateToCarteirinha = {
                navController.navigate(Routes.Carteirinha)
            }
        )

        carteirinhaScreen(
            onNavigateLogin = {
                navController.navigate(Routes.Login)
            }
        )
    }
}