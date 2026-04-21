package com.nidoham.bondhu

import androidx.compose.ui.window.ComposeUIViewController
import com.nidoham.bondhu.theme.BondhuTheme

fun MainViewController() = ComposeUIViewController {
    BondhuTheme {
        App()
    }
}