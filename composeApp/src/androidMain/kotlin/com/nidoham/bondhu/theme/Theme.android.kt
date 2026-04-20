package com.nidoham.bondhu.theme

import android.app.Activity
import android.os.Build
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

@Composable
actual fun platformColorScheme(darkTheme: Boolean): ColorScheme {
    // Material You / dynamic color: available on Android 12+ (API 31)
    val supportsDynamicColor = Build.VERSION.SDK_INT >= Build.VERSION_CODES.S
    val context = LocalContext.current
    return when {
        supportsDynamicColor && darkTheme  -> dynamicDarkColorScheme(context)
        supportsDynamicColor && !darkTheme -> dynamicLightColorScheme(context)
        darkTheme                          -> DarkColorScheme
        else                               -> LightColorScheme
    }
}

@Composable
actual fun ApplyPlatformTheme(colorScheme: ColorScheme, darkTheme: Boolean) {
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            // Edge-to-edge: let the app draw behind system bars
            WindowCompat.setDecorFitsSystemWindows(window, false)
            // Flip status-bar icon tint to match the active theme
            WindowCompat.getInsetsController(window, view)
                .isAppearanceLightStatusBars = !darkTheme
        }
    }
}