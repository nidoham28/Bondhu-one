package com.nidoham.bondhu

import androidx.compose.runtime.mutableStateOf

object AppState {
    val current = mutableStateOf<Screen>(Screen.Splash)
}