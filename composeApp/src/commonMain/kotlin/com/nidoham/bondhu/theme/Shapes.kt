package com.nidoham.bondhu.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

/**
 * M3 shape scale.
 * Renamed to [BondhuShapes] to avoid shadowing the stdlib [Shapes] type
 * in files that import both.
 */
val BondhuShapes = Shapes(
    extraSmall = RoundedCornerShape(4.dp),
    small      = RoundedCornerShape(8.dp),
    medium     = RoundedCornerShape(12.dp),
    large      = RoundedCornerShape(16.dp),
    extraLarge = RoundedCornerShape(28.dp),
)