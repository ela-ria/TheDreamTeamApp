package com.example.thedreamteamapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen(
                        onButton1Click = {
                            startActivity(Intent(this, BioStudent1::class.java))
                        },
                        onButton2Click = {
                            startActivity(Intent(this, BioStudent2::class.java))
                        },
                        onButton3Click = {
                            startActivity(Intent(this, BioStudent3::class.java))
                        },
                        onButton4Click = {
                            startActivity(Intent(this, BioStudent4::class.java))
                        },
                        onButton5Click = {
                            startActivity(Intent(this, BioStudent5::class.java))
                        }
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onButton1Click: () -> Unit,
    onButton2Click: () -> Unit,
    onButton3Click: () -> Unit,
    onButton4Click: () -> Unit,
    onButton5Click: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Home Screen") }
            )
        }
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(40.dp))

            Text(
                text = "The Dream Team",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.SemiBold
            )

            Spacer(modifier = Modifier.height(8.dp))
            Spacer(modifier = Modifier.height(28.dp))


            val buttonModifier = Modifier
                .fillMaxWidth()
                .height(52.dp)

            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Button(
                    onClick = onButton1Click,
                    modifier = buttonModifier
                ) { Text("Bio Screen 1") }

                Button(
                    onClick = onButton2Click,
                    modifier = buttonModifier
                ) { Text("Bio Screen 2") }

                Button(
                    onClick = onButton3Click,
                    modifier = buttonModifier
                ) { Text("Bio Screen 3") }

                Button(
                    onClick = onButton4Click,
                    modifier = buttonModifier
                ) { Text("Bio Screen 4") }

                Button(
                    onClick = onButton5Click,
                    modifier = buttonModifier
                ) { Text("Bio Screen 5") }
            }


        }
    }
}
