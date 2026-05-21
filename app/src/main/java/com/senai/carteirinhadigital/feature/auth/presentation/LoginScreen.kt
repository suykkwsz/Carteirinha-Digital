package com.senai.carteirinhadigital.feature.auth.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.senai.carteirinhadigital.app.navigation.Routes
import com.senai.carteirinhadigital.core.designsystem.theme.CarteirinhaDigitalTheme

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {

    var login by remember { mutableStateOf("") };
    var senha by remember { mutableStateOf("") };
    var erroLogin by remember { mutableStateOf(false) };

    var labelEmail by remember { mutableStateOf("email") };
    var labelSenha by remember { mutableStateOf("senha") };

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Login")
        TextField(
            value = login,
            onValueChange = {
                login = it
                erroLogin=false
                labelEmail="email"
                labelSenha = "senha"
            },
            label = {Text(labelEmail)},
            isError = erroLogin
        )
        OutlinedTextField(
            value = senha,
            onValueChange = {
                senha = it
                erroLogin = false
                labelSenha = "senha"
                labelEmail = "email"
            },
            label =  { Text(labelSenha) },
            isError = erroLogin
        )
        Button(
            onClick = {
                if (login == "admin" && senha == "123") {
                    erroLogin = false

                    navController.navigate(Routes.Carteirinha)
                } else {
                    erroLogin = true
                    labelEmail = "email ou senha incorretos"
                    labelSenha = labelEmail
                }
            },

            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary
            ),
            modifier = Modifier
                .width(200.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(
                width = 4.dp,
                color = MaterialTheme.colorScheme.onPrimary
            )
        ) {
            Text("Entrar")
        }
    }
}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun LoginScreenPreviewLight(){
    CarteirinhaDigitalTheme(
        darkTheme = false
    ) {
       // LoginScreen()
    }
}
@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun LoginScreenPreviewDark() {
    CarteirinhaDigitalTheme(
        darkTheme = true
    ) {
       // LoginScreen()
    }
}