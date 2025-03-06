package com.example.layout2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MondrianArt()
        }
    }
}

@Composable
fun MondrianArt() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black) // Fundo preto
            .padding(8.dp)
    ) {
        Row(modifier = Modifier.fillMaxSize()) {
            // Lado esquerdo (2 retângulos)
            Column(modifier = Modifier.weight(1f)) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(Color(0xFF6B6BB8))
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espaço entre os retângulos
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(Color(0xFFE75480))
                )
            }

            Spacer(modifier = Modifier.width(8.dp)) // Espaço entre os lados

            // Lado direito (3 retângulos de mesmo tamanho)
            Column(modifier = Modifier.weight(1f)) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(Color(0xFFB03030))
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espaço entre os retângulos
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(Color(0xFFDCDCDC))
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espaço entre os retângulos
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(Color(0xFF303090))
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMondrianArt() {
    MondrianArt()
}
