package View


import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import viewModel.TriviaSettingsViewModel
import viewModel.TriviaViewModel

@SuppressLint("UnrememberedMutableState")
@Composable
fun GameScreen(
    navController: NavController,
    settingsViewModel: TriviaSettingsViewModel,
    questionsViewModel: TriviaViewModel
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val preguntesFetes = remember { mutableStateListOf<Int>() }
        val random: Int? = remember { generarNumero(questionsViewModel, preguntesFetes) }
        val pregunta = remember(random) { questionsViewModel.historyQuestions[random ?: 0].question }
        val rondaActual = remember { mutableStateOf(1) }
        Text(text = "Ronda actual: ${rondaActual.value}/${settingsViewModel.rounds}", modifier = Modifier.fillMaxWidth(0.8f),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.fillMaxHeight(0.05f))
        Text(
            text = "$pregunta", modifier = Modifier.fillMaxWidth(0.8f),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.fillMaxHeight(0.03f))
        Column (modifier = Modifier.fillMaxWidth(0.9f)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(1f).fillMaxHeight(0.09f)
                ) {
                    Text(text = questionsViewModel.historyQuestions[random ?: 0].answers[0], textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.fillMaxWidth(0.05f)) // Spacer for some space between buttons
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(1f).fillMaxHeight(0.09f)
                ) {
                    Text(text = questionsViewModel.historyQuestions[random ?: 0].answers[1], textAlign = TextAlign.Center)
                }
            }
            Spacer(modifier = Modifier.fillMaxHeight(0.03f)) // Spacer for vertical spacing between rows
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(2f).fillMaxHeight(0.10f)
                ) {
                    Text(text = questionsViewModel.historyQuestions[random ?: 0].answers[2], textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.fillMaxWidth(0.05f)) // Spacer for some space between buttons
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(2f).fillMaxHeight(0.10f)
                ) {
                    Text(text = questionsViewModel.historyQuestions[random ?: 0].answers[3], textAlign = TextAlign.Center)
                }
            }
        }
    }
}


fun generarNumero(questionsViewModel: TriviaViewModel, preguntesFetes: MutableList<Int>): Int? {

    if (preguntesFetes.size == questionsViewModel.historyQuestions.size) {
        return null
    }
    val unusedIndices = (0 until questionsViewModel.historyQuestions.size).filterNot { it in preguntesFetes }
    return unusedIndices.random()
}



