package com.example.lab_04_git

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab_04_git.ui.theme.Lab_04_gitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab_04_gitTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Agregamos la Column para organizar verticalmente
                    Column(modifier = Modifier.padding(innerPadding)) {
                        Text(text = "Encabezado de Lista")

                        Row {
                            Text(text = "Elemento 1 ")
                            Text(text = "Elemento 2")
                        }

                        Text(text = "Elemento 3 (debajo del Row)")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab_04_gitTheme {
        Greeting("Android")
    }
}