package com.senai.carteirinhadigital.feature.auth.navigation

import com.senai.carteirinhadigital.app.navigation.Routes
import com.senai.carteirinhadigital.feature.auth.presentation.LoginScreen

fun navGraphBuilder.authScreen(
    onNavigateToCarteirinha: () -> Unit
) {
    composable(Routes.Login) {
        LoginScreen(
            onLoginClick = onNavigateToCarteirinha
        )
    }
}