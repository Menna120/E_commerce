package com.example.e_commerce.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = primary_color,
    onPrimary = white,
    inversePrimary = neutral_grey,
    secondary = primary_dark_color,
    background = white,
    error = primary_red,
    outline = neutral_light,
    tertiary = primary_yellow,
)

@Composable
fun E_commerceTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}