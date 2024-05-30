package com.pr7.jc_progressbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pr7.jc_progressbar.ui.theme.JC_ProgressbarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JC_ProgressbarTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                  Column(modifier = Modifier.padding(innerPadding)) {
                    MainScreen()
                  }
                }
            }
        }
    }
}


@Composable
fun MainScreen(modifier: Modifier = Modifier) {

    //ProgressbarIndeterminate()
    ProgressDeterminate()



}
