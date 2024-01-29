package View

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.triviaapp.R
import viewModel.TriviaSettingsViewModel


@Composable
fun MenuScreen(navController: NavController, settingsViewModel: TriviaSettingsViewModel) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Logo"
        )
        Spacer(modifier = Modifier.height(15.dp))

        var expanded by remember { mutableStateOf(false) }
        Box(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .clickable { expanded = true }
                .background(color = MaterialTheme.colorScheme.secondaryContainer),

        ) {
            Text(
                text = settingsViewModel.selectedTopic,
                modifier = Modifier
                    .padding(16.dp)
                    .align(Alignment.CenterStart)
            )
            Icon(
                Icons.Default.ArrowDropDown, "Dropdown Icon", Modifier
                    .padding(16.dp)
                    .align(Alignment.CenterEnd)

            )

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier
                    .fillMaxWidth(0.9f)

            ) {
                listOf(
                    "History",
                    "Tecnology",
                    "Cinema and Games",
                    "Mitology",
                    "Art",
                    "All"
                ).forEach { topic ->
                    DropdownMenuItem(
                        text = { Text(text = topic) },
                        onClick = {
                            expanded = false
                            settingsViewModel.modifyTopic(topic)
                        })
                }
            }
        }
        Spacer(modifier = Modifier.fillMaxHeight(0.02f))
        Button(
            onClick = { navController.navigate(Routes.GameScreen.route) },

            modifier = Modifier
                .fillMaxWidth(0.9f)
                .height(50.dp),
        ) {
            Text(text = "New game")

        }
        Spacer(modifier = Modifier.fillMaxHeight(0.02f))
        Button(
            onClick = { navController.navigate(Routes.SettingsScreen.route) },

            modifier = Modifier
                .fillMaxWidth(0.9f)
                .height(50.dp),
        ) {
            Text(text = "Settings")

        }
    }
}