package com.nidoham.bondhu

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun App() {
    // Your main UI logic, NavHost, or Screens go here
    Surface(modifier = Modifier.fillMaxSize()) {
        Text("Welcome to Bondhu!")
    }
}