package com.example.esportsapp

import android.annotation.SuppressLint
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
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.esportsapp.ui.theme.ESportsAppTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
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

    Column( modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Cyan)
        .statusBarsPadding()
        .padding(20.dp)) {

        Text(
            text = "TEAM TITANS",
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 20.dp, bottom = 20.dp)
        )

        Row(modifier = Modifier.fillMaxWidth().padding(vertical = 30.dp).background(color = Color.Blue)) {
            Text(
                text = "",
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(1f),
                color = Color.White

            )
            Text(
                text = "Jugador",
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(1f),
                color = Color.White
            )
            Text(
                text = "Rol",
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(1f),
                color = Color.White
            )
            Text(
                text = "Edad",
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(1f),
                color = Color.White
            )
            Text(
                text = "Nivel",
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(1f),
                color = Color.White
            )
        }
        Column(verticalArrangement = Arrangement.spacedBy(50.dp)) {
            Jugador("ivan", "atacante", 26, 100, R.drawable.images)

            HorizontalDivider(
                modifier = Modifier.padding(vertical = 2.dp),
                thickness = 2.dp,
                color = Color.Blue
            )

            Jugador("carlos", "defensa", 23, 78, R.drawable.jesus1)

            HorizontalDivider(
                modifier = Modifier.padding(vertical = 2.dp),
                thickness = 2.dp,
                color = Color.Blue            )

            Jugador("alex", "mago", 22, 82, R.drawable.jesus2)

            HorizontalDivider(
                modifier = Modifier.padding(vertical =2.dp),
                thickness = 2.dp,
                color = Color.Blue            )

            Jugador("juan andres", "curandero", 21, 91, R.drawable.jesucristo)
        }
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
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {

        Box(
            modifier = Modifier.weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(imagen),
                contentDescription = "Foto",
                modifier = Modifier
                    .size(70.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
        }

        Text(
            text = nombre,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.weight(1f)
        )

        Text(
            text = rol,
            textAlign = TextAlign.Center,
            modifier = Modifier.weight(1f)
        )

        Text(
            text = edad.toString(),
            textAlign = TextAlign.Center,
            modifier = Modifier.weight(1f)
        )

        Text(
            text = nivel.toString(),
            textAlign = TextAlign.Center,
            modifier = Modifier.weight(1f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun JugadorPreview() {
    Jugador(
        nombre = "Ivan",
        rol = "Atacante",
        edad = 26,
        nivel = 100,
        imagen = R.drawable.images
    )
}