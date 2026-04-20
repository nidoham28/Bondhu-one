package com.nidoham.bondhu.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.graphics.Color
import kotlinx.browser.document // If this stays red, see Step 3
import org.w3c.dom.HTMLMetaElement

@Composable
actual fun platformColorScheme(darkTheme: Boolean): ColorScheme =
    if (darkTheme) DarkColorScheme else LightColorScheme

@Composable
actual fun ApplyPlatformTheme(colorScheme: ColorScheme, darkTheme: Boolean) {
    LaunchedEffect(colorScheme, darkTheme) {
        setHtmlThemeColor(colorScheme.primary)
    }
}

private fun setHtmlThemeColor(color: Color) {
    val r = (color.red * 255).toInt().toString(16).padStart(2, '0')
    val g = (color.green * 255).toInt().toString(16).padStart(2, '0')
    val b = (color.blue * 255).toInt().toString(16).padStart(2, '0')
    val hex = "#$r$g$b"

    try {
        val head = document.head ?: return
        val existingMeta = document.querySelector("meta[name='theme-color']")

        if (existingMeta != null) {
            existingMeta.setAttribute("content", hex)
        } else {
            val meta = document.createElement("meta") as HTMLMetaElement
            meta.name = "theme-color"
            meta.content = hex
            head.appendChild(meta)
        }
    } catch (e: Throwable) {
        // Silently catch errors if the DOM isn't ready
    }
}