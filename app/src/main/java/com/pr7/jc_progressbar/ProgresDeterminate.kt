package com.pr7.jc_progressbar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay
import java.text.DecimalFormat


@Composable
fun ProgressDeterminate(modifier: Modifier = Modifier) {



    var progress by remember {  mutableStateOf(0f) }

    LaunchedEffect(key1 = Unit) {

        while (true){
            delay(1200)
            if (progress>=.99f){
                break
            }
            progress+=0.01f

        }

    }
    val pattern = "#.##"
    val decimalFormat = DecimalFormat(pattern)
   // val format = decimalFormat.format(3.14)
    
    Column {
        LinearProgressIndicator(
            modifier=Modifier.fillMaxWidth(),
            progress = progress,
        )
        CircularProgressIndicator(
            progress=progress
        )
        
        Text(text = "${decimalFormat.format(progress*100)} %")
        //Text(text = "${progress} %")

    }

    
}