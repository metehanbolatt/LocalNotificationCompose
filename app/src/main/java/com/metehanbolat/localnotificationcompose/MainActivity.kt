package com.metehanbolat.localnotificationcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import com.metehanbolat.CounterNotificationService
import com.metehanbolat.localnotificationcompose.ui.theme.LocalNotificationComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val service = CounterNotificationService(applicationContext)
        setContent {
            LocalNotificationComposeTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    Button(onClick = {
                        service.showNotification(Counter.value)
                    }) {
                        Text(text = "Show Notification")
                    }
                }
            }
        }
    }
}
