package com.erick.herrera.pkassessment.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = DarkColorPrimary,
    background = DarkBackground,
    onBackground = DarkTextColor,
    onPrimary = DarkGray
)

private val LightColorPalette = lightColors(
    primary = LightColorPrimary,
    background = LightBackground,
    onBackground = LightTextColor,
    onPrimary = DarkGray
)

@Composable
fun PKAssessmentTheme(
    darkTheme: Boolean = true,//isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}