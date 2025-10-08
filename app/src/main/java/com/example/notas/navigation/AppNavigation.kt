package com.example.notas.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.notas.ui.theme.screens.screens.HomeScreen
import com.example.notas.ui.theme.screens.NoteDetailScreen
import com.example.notas.ui.theme.screens.TaskDetailScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("noteDetail") { NoteDetailScreen(navController) }
        composable("taskDetail") { TaskDetailScreen(navController) }
    }
}
