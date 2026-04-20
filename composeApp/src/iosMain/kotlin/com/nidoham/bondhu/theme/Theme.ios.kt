package com.nidoham.bondhu.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable

@Composable
actual fun platformColorScheme(darkTheme: Boolean): ColorScheme =
    if (darkTheme) DarkColorScheme else LightColorScheme

/**
 * iOS chrome is managed by the host UIViewController / SwiftUI layer.
 * Status-bar style follows the system automatically when
 * UIViewControllerBasedStatusBarAppearance = YES in Info.plist.
 *
 * If you need explicit control, call UIApplication.shared.setStatusBarStyle
 * via a KMP interop helper here.
 */
@Composable
actual fun ApplyPlatformTheme(colorScheme: ColorScheme, darkTheme: Boolean) = Unit