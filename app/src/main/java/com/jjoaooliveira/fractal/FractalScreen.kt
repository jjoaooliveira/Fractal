package com.jjoaooliveira.fractal

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jjoaooliveira.fractal.model.Tip
import com.jjoaooliveira.fractal.model.TipList.tips
import com.jjoaooliveira.fractal.ui.theme.FractalTheme

@Composable
fun TipList() {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 6.dp),
        content = {
            items(tips) {
                TipCard(tip = it)
            }
        }
    )
}

@Composable
fun TipCard(
    modifier: Modifier = Modifier,
    tip: Tip
) {
   Card(
       modifier
           .padding(5.dp)
           .width(360.dp)
           .heightIn(min = 260.dp)
       ,
        elevation = 2.dp
   ) {
       Column(
           modifier = Modifier
               .padding(10.dp),
           verticalArrangement = Arrangement.spacedBy(10.dp)
       ) {
           TipHead(tip.tipName)

           Row(
               modifier = Modifier.fillMaxWidth(),
               horizontalArrangement = Arrangement.Center
           ) {
               TipImage(tip.tipImage)
           }

           TipDesc(tip.tipDescription)

       }
   }
}

@Composable
fun TipHead(
    @StringRes tipName: Int
) {
    Text(
        text = stringResource(id = tipName),
        style = MaterialTheme.typography.h1
    )
}

@Composable
fun TipImage(
    @DrawableRes tipImage: Int,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = tipImage),
        contentDescription = null,
        modifier
            .size(148.dp)
            .clip(shape = MaterialTheme.shapes.medium)
    )
}

@Composable
fun TipDesc(
    @StringRes tipDesc: Int,
    modifier: Modifier = Modifier
) {
    Text(
        text = stringResource(id = tipDesc),
        modifier.fillMaxWidth(),
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.body1
    )
}
