package com.jjoaooliveira.fractal.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Tip(
    @StringRes val tipName: Int,
    @StringRes val tipDescription: Int,
    @DrawableRes val tipImage: Int
)
