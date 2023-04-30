package com.jjoaooliveira.fractal

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jjoaooliveira.fractal.ui.theme.FractalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FractalTheme {
                // A surface container using the 'background' color from the theme
                 FractalApp()
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun FractalApp(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = { MainTopBar() },
    ) {
        Column(
            //modifier.background(MaterialTheme.colors.background)
        ) {
            Spacer(modifier = Modifier.height(200.dp)) //ajustar no final
            TipList()
        }
    }
}

@Composable
fun MainTopBar(modifier: Modifier = Modifier) {
    Row(
        modifier.fillMaxWidth().padding(5.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = "FRACTAL",
            style = MaterialTheme.typography.h1
        )
    }
}


@Preview(showSystemUi = true)
@Composable
fun FractalPreview() {
    FractalTheme {
       FractalApp()
    }
}