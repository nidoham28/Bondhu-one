package com.nidoham.bondhu

sealed class Screen {
    data object Splash : Screen()
    data object Home : Screen()
}