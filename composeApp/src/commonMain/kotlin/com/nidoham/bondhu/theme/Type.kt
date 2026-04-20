package com.nidoham.bondhu.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**
 * Platform-resolved font family.
 *
 * FontFamily.Default maps to:
 *   Android → Roboto / dynamic system font (API 31+)
 *   iOS     → SF Pro
 *   Web     → system-ui / -apple-system stack (via CSS)
 *
 * Swap this for a custom font loaded via Font() / loadFont() if desired.
 */
private val SystemFont = FontFamily.Default

/**
 * Full Material 3 type scale aligned to the 2025/26 spec.
 * Key changes vs original:
 *  – Added missing display/headline/body/label variants
 *  – Tightened letter-spacing on large display styles
 *  – Added titleSmall, bodySmall, labelMedium
 */
val BondhuTypography = Typography(

    // ── Display ───────────────────────────────────────────
    displayLarge = TextStyle(
        fontFamily    = SystemFont,
        fontWeight    = FontWeight.W400,
        fontSize      = 57.sp,
        lineHeight    = 64.sp,
        letterSpacing = (-0.25).sp,
    ),
    displayMedium = TextStyle(
        fontFamily    = SystemFont,
        fontWeight    = FontWeight.W400,
        fontSize      = 45.sp,
        lineHeight    = 52.sp,
        letterSpacing = 0.sp,
    ),
    displaySmall = TextStyle(
        fontFamily    = SystemFont,
        fontWeight    = FontWeight.W400,
        fontSize      = 36.sp,
        lineHeight    = 44.sp,
        letterSpacing = 0.sp,
    ),

    // ── Headline ──────────────────────────────────────────
    headlineLarge = TextStyle(
        fontFamily    = SystemFont,
        fontWeight    = FontWeight.W400,
        fontSize      = 32.sp,
        lineHeight    = 40.sp,
        letterSpacing = 0.sp,
    ),
    headlineMedium = TextStyle(
        fontFamily    = SystemFont,
        fontWeight    = FontWeight.W400,
        fontSize      = 28.sp,
        lineHeight    = 36.sp,
        letterSpacing = 0.sp,
    ),
    headlineSmall = TextStyle(
        fontFamily    = SystemFont,
        fontWeight    = FontWeight.W400,
        fontSize      = 24.sp,
        lineHeight    = 32.sp,
        letterSpacing = 0.sp,
    ),

    // ── Title ─────────────────────────────────────────────
    titleLarge = TextStyle(
        fontFamily    = SystemFont,
        fontWeight    = FontWeight.W400,
        fontSize      = 22.sp,
        lineHeight    = 28.sp,
        letterSpacing = 0.sp,
    ),
    titleMedium = TextStyle(
        fontFamily    = SystemFont,
        fontWeight    = FontWeight.W500,
        fontSize      = 16.sp,
        lineHeight    = 24.sp,
        letterSpacing = 0.15.sp,
    ),
    titleSmall = TextStyle(
        fontFamily    = SystemFont,
        fontWeight    = FontWeight.W500,
        fontSize      = 14.sp,
        lineHeight    = 20.sp,
        letterSpacing = 0.1.sp,
    ),

    // ── Body ──────────────────────────────────────────────
    bodyLarge = TextStyle(
        fontFamily    = SystemFont,
        fontWeight    = FontWeight.W400,
        fontSize      = 16.sp,
        lineHeight    = 24.sp,
        letterSpacing = 0.5.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily    = SystemFont,
        fontWeight    = FontWeight.W400,
        fontSize      = 14.sp,
        lineHeight    = 20.sp,
        letterSpacing = 0.25.sp,
    ),
    bodySmall = TextStyle(
        fontFamily    = SystemFont,
        fontWeight    = FontWeight.W400,
        fontSize      = 12.sp,
        lineHeight    = 16.sp,
        letterSpacing = 0.4.sp,
    ),

    // ── Label ─────────────────────────────────────────────
    labelLarge = TextStyle(
        fontFamily    = SystemFont,
        fontWeight    = FontWeight.W500,
        fontSize      = 14.sp,
        lineHeight    = 20.sp,
        letterSpacing = 0.1.sp,
    ),
    labelMedium = TextStyle(
        fontFamily    = SystemFont,
        fontWeight    = FontWeight.W500,
        fontSize      = 12.sp,
        lineHeight    = 16.sp,
        letterSpacing = 0.5.sp,
    ),
    labelSmall = TextStyle(
        fontFamily    = SystemFont,
        fontWeight    = FontWeight.W500,
        fontSize      = 11.sp,
        lineHeight    = 16.sp,
        letterSpacing = 0.5.sp,
    ),
)