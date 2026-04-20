package com.nidoham.bondhu

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.nidoham.bondhu.theme.BondhuTheme

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    // Replace "compose-app" with the ID used in your index.html
    ComposeViewport(viewportContainerId = "compose-app") {
        BondhuTheme {
        }
    }
}