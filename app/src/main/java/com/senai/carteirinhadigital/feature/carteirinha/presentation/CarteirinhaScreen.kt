package com.senai.carteirinhadigital.feature.carteirinha.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rafaelcosta.carteirinhadigital_4devm_t1.feature.carteirinha.presentation.component.QrCode
import com.senai.carteirinhadigital.R
import com.senai.carteirinhadigital.core.designsystem.theme.CarteirinhaDigitalTheme

@Composable
fun CarteirinhaScreen(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit = {}) {
    Box {
        Image(
            painter = painterResource(id = R.drawable.fundoroxo),
            contentDescription = "fundo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(space = 10.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.senai_logo),
                contentDescription = "Senai logo preta",
                modifier = Modifier
                    .size(250.dp)
            )
            Image(
                painter = painterResource(R.drawable.primobigode),
                contentDescription = "Primo bigode",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape)
                    .border(width = 2.dp, color = Color.Blue, CircleShape)
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = "Nome: ",
                    fontSize = 15.sp
                )
                Text(
                    text = "Amanda Campillo",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )

            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(text = "Curso: ")
                Text(text = "Desenvolvimento de Sistemas")
            }

            QrCode(conteudo = "90000000001755008306")
        }
    }
}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun CarteirinhaDigitalAppPreview() {
    CarteirinhaDigitalTheme {
        CarteirinhaScreen(
            modifier = Modifier.fillMaxSize()
        )
    }
}