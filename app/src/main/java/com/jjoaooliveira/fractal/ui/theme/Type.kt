package com.jjoaooliveira.fractal.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineBreak
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jjoaooliveira.fractal.R

// Set of Material typography styles to start with
val cabin = FontFamily(
    Font(R.font.cabin_bold, FontWeight.Bold),
    Font(R.font.cabin_regular, FontWeight.Normal)
)

//Mudar essas fontes

val Typography = Typography(
    defaultFontFamily = cabin,
    h1 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
        lineBreak = LineBreak.Heading
    ),
    h2 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    body1 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineBreak = LineBreak.Simple
    )
)