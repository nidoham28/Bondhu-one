package com.nidoham.bondhu.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// ─────────────────────────────────────────────
//  Raw color tokens  (brand palette – M3 tonal)
// ─────────────────────────────────────────────

// Primary – Violet
private val Violet10  = Color(0xFF21005D)
private val Violet20  = Color(0xFF381E72)
private val Violet40  = Color(0xFF6650A4)
private val Violet80  = Color(0xFFD0BCFF)
private val Violet90  = Color(0xFFEADDFF)
private val Violet95  = Color(0xFFF6EDFF)

// Secondary – Mauve
private val Mauve10   = Color(0xFF1D192B)
private val Mauve20   = Color(0xFF332D41)
private val Mauve40   = Color(0xFF625B71)
private val Mauve60   = Color(0xFF958DA5)
private val Mauve80   = Color(0xFFCCC2DC)
private val Mauve90   = Color(0xFFE8DEF8)

// Tertiary – Rose
private val Rose10    = Color(0xFF31111D)
private val Rose20    = Color(0xFF492532)
private val Rose40    = Color(0xFF7D5260)
private val Rose80    = Color(0xFFEFB8C8)
private val Rose90    = Color(0xFFFFD8E4)

// Error – Red
private val Red10     = Color(0xFF410E0B)
private val Red20     = Color(0xFF601410)
private val Red40     = Color(0xFFB3261E)
private val Red80     = Color(0xFFF2B8B5)
private val Red90     = Color(0xFFF9DEDC)

// Neutral
private val Neutral4  = Color(0xFF0F0E13)
private val Neutral6  = Color(0xFF141218)
private val Neutral10 = Color(0xFF1C1B1F)
private val Neutral12 = Color(0xFF201F24)
private val Neutral17 = Color(0xFF2B2930)
private val Neutral22 = Color(0xFF36343B)
private val Neutral87 = Color(0xFFDDD8E3)
private val Neutral90 = Color(0xFFE6E1E5)
private val Neutral92 = Color(0xFFECE6F0)
private val Neutral94 = Color(0xFFF3EDF7)
private val Neutral96 = Color(0xFFF5EFF7)
private val Neutral99 = Color(0xFFFFFBFE)

// Neutral Variant
private val NeutralVar30 = Color(0xFF49454F)
private val NeutralVar50 = Color(0xFF79747E)
private val NeutralVar60 = Color(0xFF938F99)
private val NeutralVar80 = Color(0xFFCAC4D0)
private val NeutralVar90 = Color(0xFFE7E0EC)

// ─────────────────────────────────────────────
//  Assembled ColorScheme objects
// ─────────────────────────────────────────────

val LightColorScheme: ColorScheme = lightColorScheme(
    primary              = Violet40,
    onPrimary            = Color.White,
    primaryContainer     = Violet90,
    onPrimaryContainer   = Violet10,

    secondary            = Mauve40,
    onSecondary          = Color.White,
    secondaryContainer   = Mauve90,
    onSecondaryContainer = Mauve10,

    tertiary             = Rose40,
    onTertiary           = Color.White,
    tertiaryContainer    = Rose90,
    onTertiaryContainer  = Rose10,

    error                = Red40,
    onError              = Color.White,
    errorContainer       = Red90,
    onErrorContainer     = Red10,

    background           = Neutral99,
    onBackground         = Neutral10,
    surface              = Neutral99,
    onSurface            = Neutral10,
    surfaceVariant       = NeutralVar90,
    onSurfaceVariant     = NeutralVar30,
    surfaceTint          = Violet40,

    outline              = NeutralVar50,
    outlineVariant       = NeutralVar80,

    scrim                = Color.Black,
    inverseSurface       = Neutral22,
    inverseOnSurface     = Neutral94,
    inversePrimary       = Violet80,
)

val DarkColorScheme: ColorScheme = darkColorScheme(
    primary              = Violet80,
    onPrimary            = Violet20,
    primaryContainer     = Color(0xFF4F378B),
    onPrimaryContainer   = Violet90,

    secondary            = Mauve80,
    onSecondary          = Mauve20,
    secondaryContainer   = Color(0xFF4A4458),
    onSecondaryContainer = Mauve90,

    tertiary             = Rose80,
    onTertiary           = Rose20,
    tertiaryContainer    = Color(0xFF633B48),
    onTertiaryContainer  = Rose90,

    error                = Red80,
    onError              = Red20,
    errorContainer       = Color(0xFF8C1D18),
    onErrorContainer     = Red90,

    background           = Neutral6,
    onBackground         = Neutral90,
    surface              = Neutral6,
    onSurface            = Neutral90,
    surfaceVariant       = NeutralVar30,
    onSurfaceVariant     = NeutralVar80,
    surfaceTint          = Violet80,

    outline              = NeutralVar60,
    outlineVariant       = NeutralVar30,

    scrim                = Color.Black,
    inverseSurface       = Neutral90,
    inverseOnSurface     = Neutral10,
    inversePrimary       = Violet40,
)