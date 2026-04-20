package com.nidoham.bondhu.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

/**
 * Returns the correct [ColorScheme] for the current platform and dark-mode state.
 * Android: honours Material You / dynamic color on API 31+.
 * iOS / Web: falls back to [LightColorScheme] / [DarkColorScheme].
 */
@Composable
expect fun platformColorScheme(darkTheme: Boolean): ColorScheme

/**
 * Applies platform-specific chrome tweaks (status-bar tint, root background, etc.)
 * after the [MaterialTheme] wrapper is in place.
 */
@Composable
expect fun ApplyPlatformTheme(colorScheme: ColorScheme, darkTheme: Boolean)

@Composable
fun BondhuTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = platformColorScheme(darkTheme)

    ApplyPlatformTheme(colorScheme, darkTheme)

    MaterialTheme(
        colorScheme = colorScheme,
        typography  = BondhuTypography,
        shapes      = BondhuShapes,
        content     = content,
    )
}