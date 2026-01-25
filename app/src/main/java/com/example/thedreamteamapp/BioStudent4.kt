package com.example.thedreamteamapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Modifier


class BioStudent4: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    StudentScreen(
                        profileImageRes = R.drawable.student4,
                        studentName = "Eunel Angelo Guarte",
                        bio = "Dangal Greetings! I am a student studying Information Technology" +
                                " . My passions are drawing, gaming, and studying.",
                        onBackClick = { finish() }
                    )
                }
            }
        }
    }
}