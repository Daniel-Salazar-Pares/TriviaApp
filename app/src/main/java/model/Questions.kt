package model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import viewModel.TriviaViewModel

class Questions {

    enum class Difficulty {
        EASY, NORMAL, HARD
    }

    data class TriviaQuestion(
        val question: String,
        val answers: List<String>,
        val correctAnswerIndex: Int,
        val difficulty: Difficulty,
    ) {

    }
}