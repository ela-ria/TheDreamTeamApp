package com.example.thedreamteamapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Modifier


class BioStudent5: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    StudentScreen(
                        profileImageRes = R.drawable.student5,
                        studentName = "Mary Mae L. Frisco",
                        bio = "Dangal Greetings! I am a student studying Information Technology" +
                                " . I enjoy designing digital solutions.",
                        onBackClick = { finish() }
                    )
                }
            }
        }
    }
}