package com.example.fishfolio

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen() {
    var selectedItemIndex by rememberSaveable { mutableIntStateOf(0) }

    Scaffold(
        bottomBar = {
            NavigationBar {
                navigationItems.forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = selectedItemIndex == index,
                        onClick = { selectedItemIndex = index },
                        label = { Text(text = item.title) },
                        icon = {
                            Icon(
                                imageVector = if (selectedItemIndex == index)
                                    item.selectedIcon
                                else
                                    item.unselectedIcon,
                                contentDescription = item.title
                            )
                        }
                    )
                }
            }
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            when (selectedItemIndex) {
                0 -> CameraScreen()
                1 -> CatchesScreen()
                2 -> CatalogScreen()
            }
        }
    }
}
