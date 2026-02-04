package ru.sicampus.bootcamp2026

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.sicampus.bootcamp2026.screens.LoginScreen
import ru.sicampus.bootcamp2026.screens.RegisterScreen
import ru.sicampus.bootcamp2026.screens.calendar.CalendarScreen
import ru.sicampus.bootcamp2026.screens.calendar.components.CalendarBottomBar
import ru.sicampus.bootcamp2026.screens.calendar.components.CalendarDayCell
import ru.sicampus.bootcamp2026.screens.calendar.components.CalendarGrid
import ru.sicampus.bootcamp2026.ui.theme.screen.ListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(
                        modifier = Modifier.fillMaxSize().padding(innerPadding)
                    ){
                        LoginScreen(
                            onLoginClick = {},
                            onRegisterLinkClick = {}
                        )

                    }
                }
            }
        }
    }
}