package com.nidoham.bondhu

import androidx.compose.runtime.Composable
import com.nidoham.bondhu.screen.*

@Composable
fun Router() {
    when (AppState.current.value) {
        Screen.Splash  -> SplashScreen(onFinish = { AppState.current.value = Screen.Home })
        Screen.Home    -> HomeScreen()

        else -> {
            println("Unknown screen: ${AppState.current.value}")
        }
    }
}