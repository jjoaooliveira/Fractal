package com.jjoaooliveira.fractal.model

import com.jjoaooliveira.fractal.R

object TipList {
    val tips: List<Tip> = listOf(
        Tip(
            tipName = R.string.tip1_name,
            tipImage = R.drawable.blooming,
            tipDescription = R.string.tip1_description
        ),
        Tip(
            tipName = R.string.tip2_name,
            tipImage = R.drawable.healthy_habit,
            tipDescription = R.string.tip2_description
        ),
        Tip(
            tipName = R.string.tip3_name,
            tipImage = R.drawable.imagination,
            tipDescription = R.string.tip3_description
        )
    )
}