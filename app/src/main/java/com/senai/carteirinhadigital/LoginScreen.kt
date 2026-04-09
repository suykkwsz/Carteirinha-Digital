package com.senai.carteirinhadigital

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.platform.ValueElement
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.senai.carteirinhadigital.ui.theme.CarteirinhaDigitalTheme

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Login")
        TextField(
            value = "",
            onValueChange = {},
            label = {Text("Email")}
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label =  { Text("Senha") }
        )
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary
            ),
            modifier = Modifier
                .width(200.dp),
            shape = RoundedCornerShape(7.dp),
            border = BorderStroke(
                width = 2.dp,
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
        LoginScreen()
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
        LoginScreen()
    }
}