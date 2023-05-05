package com.jjoaooliveira.fractal

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.jjoaooliveira.fractal.model.Tip
import com.jjoaooliveira.fractal.model.TipList.tips


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
    var expanded by remember { mutableStateOf(false) }
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
               .padding(10.dp)
               .animateContentSize(
                   animationSpec = spring(
                       dampingRatio = Spring.DampingRatioLowBouncy)),
           verticalArrangement = Arrangement.spacedBy(5.dp)
       ) {
           Row(
               modifier = Modifier.fillMaxWidth(),
               horizontalArrangement = Arrangement.SpaceBetween
           ) {
               TipHead(tip.tipName)
               TipButton(
                   expanded = expanded,
                   onClick = { expanded = !expanded }
               )
           }
           Row(
               modifier = Modifier.fillMaxWidth(),
               horizontalArrangement = Arrangement.Center,
           ) {
               TipImage(tip.tipImage)
           }

           if(expanded) {
               Spacer(modifier = Modifier.height(20.dp))
               TipDesc(tip.tipDescription)
               Spacer(modifier = Modifier.height(10.dp))
           }

       }
   }
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

@Composable
fun TipButton(
    expanded: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(onClick = onClick) {
        Icon(
            imageVector = if(expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
            contentDescription = null,
            tint = MaterialTheme.colors.secondary
        )
    }
}

@Composable
fun TipHead(
    @StringRes tipName: Int
) {
    Text(
        text = stringResource(id = tipName),
        style = MaterialTheme.typography.h2
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
