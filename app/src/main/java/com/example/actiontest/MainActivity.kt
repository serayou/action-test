package com.example.actiontest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.actiontest.ui.theme.ActionTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ActionTestTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ActionTest(
                        msg = "Build APK",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ActionTest(msg: String, modifier: Modifier = Modifier) {
    Text(
        text = "$msg!!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun ActionTestPreview() {
    ActionTestTheme {
        ActionTest("Build APK")
    }
}