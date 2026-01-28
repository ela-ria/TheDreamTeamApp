package com.example.thedreamteamapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Modifier


class BioStudent2: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    StudentScreen(
                        profileImageRes = R.drawable.student2,
                        studentName = "Kim Aldrin D. Maurin",
                        bio = "Dangal Greetings! I am a student studying Information Technology" +
                                " . My passions are playing online games and watching movies.",
                        onBackClick = { finish() }
                    )
                }
            }
        }
    }
}