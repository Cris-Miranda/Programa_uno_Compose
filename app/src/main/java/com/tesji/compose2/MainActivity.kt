package com.tesji.compose2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.tesji.compose2.ui.theme.Compose2Theme
import androidx.compose.foundation.layout.Column


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TablaMultiplicar(tabla = 5)
        }
    }
}
@Composable
fun TablaMultiplicar(tabla:Int) {
    Column {
        for(x in 1..10) {
            Text(text="$tabla * $x = ${tabla*x}")
        }
    }
}

