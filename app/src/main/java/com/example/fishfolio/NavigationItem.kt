package com.example.fishfolio

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.ShoppingBasket
import androidx.compose.material.icons.automirrored.filled.MenuBook  // ← ZMIEŃ
import androidx.compose.material.icons.outlined.CameraAlt
import androidx.compose.material.icons.outlined.ShoppingBasket
import androidx.compose.material.icons.automirrored.outlined.MenuBook  // ← ZMIEŃ
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String) {
    object Camera : Screen("camera")
    object Catches : Screen("catches")
    object Catalog : Screen("catalog")
}

data class NavigationItem(
    val screen: Screen,
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector
)

val navigationItems = listOf(
    NavigationItem(
        screen = Screen.Camera,
        title = "Aparat",
        selectedIcon = Icons.Filled.CameraAlt,
        unselectedIcon = Icons.Outlined.CameraAlt
    ),
    NavigationItem(
        screen = Screen.Catches,
        title = "Połowy",
        selectedIcon = Icons.Filled.ShoppingBasket,
        unselectedIcon = Icons.Outlined.ShoppingBasket
    ),
    NavigationItem(
        screen = Screen.Catalog,
        title = "Katalog",
        selectedIcon = Icons.AutoMirrored.Filled.MenuBook,
        unselectedIcon = Icons.AutoMirrored.Outlined.MenuBook
    )
)
