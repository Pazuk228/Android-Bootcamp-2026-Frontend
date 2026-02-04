package ru.sicampus.bootcamp2026.ui.theme.screen.register

import ru.sicampus.bootcamp2026.ui.navigation.AppRoute

sealed interface RegisterAction {
    data class OpenScreen(val route: AppRoute): RegisterAction
    object NavigateBack : RegisterAction
    object ShowSuccessMessage : RegisterAction
}