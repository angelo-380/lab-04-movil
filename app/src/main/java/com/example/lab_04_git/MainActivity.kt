package com.example.lab_04_git

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab_04_git.ui.theme.Lab_04_gitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab_04_gitTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
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

        MyRow()

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

// Único componente modificado en la rama MAIN
@Composable
fun MyBox() {
    Box(
        modifier = Modifier
            .size(120.dp)
            .background(Color(0xFF6200EE), shape = CircleShape) // Color púrpura circular
            .border(3.dp, Color.Black, CircleShape),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "MAIN",
            color = Color.White,
            fontSize = 14.sp
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