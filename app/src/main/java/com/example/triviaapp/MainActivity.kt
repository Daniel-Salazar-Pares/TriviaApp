package com.example.triviaapp

import androidx.compose.runtime.Composable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.triviaapp.ui.theme.TriviaAppTheme
import viewModel.TriviaSettingsViewModel
import View.*
import viewModel.TriviaViewModel

class MainActivity : ComponentActivity() {
    private val settingsViewModel by viewModels<TriviaSettingsViewModel>()
    private val questionsTriviaViewModel by viewModels<TriviaViewModel>()
    // Define questionsViewModel if required
    // private val questionsViewModel by viewModels<QuestionsViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TriviaAppTheme(darkTheme = settingsViewModel.darkMode) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TriviaNavHost(settingsViewModel /*, questionsViewModel if needed */)
                }
            }
        }
    }

    @Composable
    fun TriviaNavHost(settingsViewModel: TriviaSettingsViewModel /*, questionsViewModel: QuestionsViewModel if needed */) {
        val navigationController = rememberNavController()
        NavHost(
            navController = navigationController,
            startDestination = Routes.LaunchScreen.route
        ) {
            composable(Routes.LaunchScreen.route) { LaunchScreen(navigationController) }
            composable(Routes.MenuScreen.route) { MenuScreen(navigationController, settingsViewModel) }
            composable(Routes.SettingsScreen.route) { SettingsScreen(navigationController, settingsViewModel) }
            composable(Routes.GameScreen.route) { GameScreen(navigationController, settingsViewModel, questionsTriviaViewModel) }
            composable(Routes.ResultScreen.route) { ResultScreen(navigationController, /* Add settingsViewModel here if needed */) }
        }
    }
}
