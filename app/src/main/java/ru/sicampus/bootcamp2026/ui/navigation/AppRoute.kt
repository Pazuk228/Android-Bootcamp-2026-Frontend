package ru.sicampus.bootcamp2026.ui.navigation

sealed class AppRoute(val route: String) {
    object AuthRoute : AppRoute("auth")
    object LoginRoute : AppRoute("login")
    object RegisterRoute : AppRoute("register")
    object ListRoute : AppRoute("list")
}