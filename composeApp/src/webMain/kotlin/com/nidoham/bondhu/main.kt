package com.nidoham.bondhu

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.nidoham.bondhu.theme.BondhuTheme

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport {
        BondhuTheme {
            App()
        }
    }
}