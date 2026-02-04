package ru.sicampus.bootcamp2026.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.runBlocking
import ru.sicampus.bootcamp2026.data.source.AuthLocalDataSource
import ru.sicampus.bootcamp2026.ui.theme.screen.ListScreen
import ru.sicampus.bootcamp2026.ui.theme.screen.auth.AuthScreen


@Composable
fun NavigationGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    val currentToken = runBlocking { AuthLocalDataSource.getToken() }
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = (if (currentToken == null) AuthRoute else ListRoute).toString()
    ) {
        composable<AuthRoute> {
            AuthScreen(
                navController = navController
            )
        }
        composable<ListRoute> {
            ListScreen(
                navController = navController
            )
        }
    }
}

