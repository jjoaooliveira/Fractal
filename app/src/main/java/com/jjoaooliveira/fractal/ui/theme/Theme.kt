package com.jjoaooliveira.fractal.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColor = darkColors(
    background = LightPurple,
    surface = DarkPurple,
    secondary = White
)

private val LightColor = lightColors(
    background = White,
    surface = LightGrey,
    onSurface = Black,
    secondary = Black
)

@Composable
fun FractalTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColor else LightColor

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}