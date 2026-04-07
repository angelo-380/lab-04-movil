package com.example.lab_04_git

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab_04_git.ui.theme.Lab_04_gitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab_04_gitTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Llamada a la función principal que organiza todo
                    MainContent(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MainContent(modifier: Modifier = Modifier) {
    MyColumn(modifier)
}

@Composable
fun MyColumn(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = "Encabezado de Lista")

        // Llamada al componente Row
        MyRow()

        // Llamada al componente Box
        MyBox()

        Text(text = "Elemento debajo del Box")
    }
}

@Composable
fun MyRow() {
    Row {
        Text(text = "Elemento 1 ")
        Text(text = "Elemento 2")
    }
}

@Composable
fun MyBox() {
    Box(
        modifier = Modifier
            .size(100.dp)
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Centro")
        Text(
            text = "Esquina",
            modifier = Modifier.align(Alignment.BottomEnd),
            color = Color.Red
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MainPreview() {
    Lab_04_gitTheme {
        MainContent()
    }
}