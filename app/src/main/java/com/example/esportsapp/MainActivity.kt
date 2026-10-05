package com.example.esportsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
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

val Fondo = Color(0xFF10131A)
val FondoJugador = Color(0xFF1B1F2A)
val Azul = Color(0xFF5865F2)
val TextoPrincipal = Color(0xFFF2F2F2)
val TextoSecundario = Color(0xFFB8BAC4)
val Separador = Color(0xFF34394A)

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            PantallaPrincipal()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaPrincipal() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Fondo)
            .statusBarsPadding()
            .padding(20.dp)
    ) {

        Text(
            text = "TEAM TITANS",
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 20.dp, bottom = 25.dp)
        )

        Jugador(
            nombre = "Ivan",
            rol = "Atacante",
            edad = 26,
            nivel = 100,
            imagen = R.drawable.images
        )

        HorizontalDivider(
            modifier = Modifier.padding(vertical = 12.dp),
            thickness = 2.dp,
            color = Separador
        )

        Jugador(
            nombre = "Carlos",
            rol = "Defensa",
            edad = 23,
            nivel = 78,
            imagen = R.drawable.jesus1
        )

        HorizontalDivider(
            modifier = Modifier.padding(vertical = 12.dp),
            thickness = 2.dp,
            color = Separador
        )

        Jugador(
            nombre = "Alex",
            rol = "Mago",
            edad = 22,
            nivel = 82,
            imagen = R.drawable.jesus2
        )

        HorizontalDivider(
            modifier = Modifier.padding(vertical = 12.dp),
            thickness = 2.dp,
            color = Separador
        )

        Jugador(
            nombre = "Juan Andres",
            rol = "Curandero",
            edad = 21,
            nivel = 91,
            imagen = R.drawable.jesucristo
        )
    }
}

@Composable
fun Jugador(
    nombre: String,
    rol: String,
    edad: Int,
    nivel: Int,
    @DrawableRes imagen: Int
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = FondoJugador,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(15.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(
            contentAlignment = Alignment.Center
        ) {

            Image(
                painter = painterResource(imagen),
                contentDescription = "Foto de $nombre",
                modifier = Modifier
                    .size(75.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
        }

        Column(
            modifier = Modifier
                .padding(start = 20.dp)
                .weight(1f),
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {

            Text(
                text = nombre,
                color = TextoPrincipal,
                fontSize = 19.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Rol: $rol",
                color = TextoSecundario,
                fontSize = 14.sp
            )

            Text(
                text = "Edad: $edad años",
                color = TextoSecundario,
                fontSize = 14.sp
            )

            Text(
                text = "Nivel: $nivel",
                color = Azul,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun JugadorPreview() {

    Box(
        modifier = Modifier
            .background(Fondo)
            .padding(20.dp)
    ) {

        Jugador(
            nombre = "Ivan",
            rol = "Atacante",
            edad = 26,
            nivel = 100,
            imagen = R.drawable.images
        )
    }
}