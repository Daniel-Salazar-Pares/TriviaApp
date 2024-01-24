package viewModel

import androidx.lifecycle.ViewModel
import model.Questions.*

class TriviaViewModel: ViewModel() {

    val historyQuestions = listOf(
        TriviaQuestion(
            question = "What year did World War II end?",
            answers = listOf("1945", "1939", "1944", "1950"),
            correctAnswerIndex = 0,
            difficulty = Difficulty.EASY,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Who was the first president of the United States?",
            answers = listOf("Thomas Jefferson", "Abraham Lincoln", "George Washington", "John Adams"),
            correctAnswerIndex = 2,
            difficulty = Difficulty.EASY,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "In which country were the ancient Pyramids of Giza built?",
            answers = listOf("Mexico", "Egypt", "Peru", "India"),
            correctAnswerIndex = 1,
            difficulty = Difficulty.EASY,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "What was the main language of the Roman Empire?",
            answers = listOf("Greek", "Latin", "Aramaic", "Italian"),
            correctAnswerIndex = 1,
            difficulty = Difficulty.EASY,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Who was known as the 'Maid of Orleans'?",
            answers = listOf("Catherine the Great", "Joan of Arc", "Queen Elizabeth I", "Marie Antoinette"),
            correctAnswerIndex = 1,
            difficulty = Difficulty.EASY,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Which ancient civilization built the Machu Picchu complex?",
            answers = listOf("The Mayans", "The Aztecs", "The Incas", "The Romans"),
            correctAnswerIndex = 2,
            difficulty = Difficulty.EASY,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "What was the name of the ship that famously sank after hitting an iceberg in 1912?",
            answers = listOf("HMS Titanic", "HMS Endeavour", "SS Californian", "RMS Lusitania"),
            correctAnswerIndex = 0,
            difficulty = Difficulty.EASY,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Which world leader famously established the 'New Deal'?",
            answers = listOf("Winston Churchill", "Franklin D. Roosevelt", "John F. Kennedy", "Joseph Stalin"),
            correctAnswerIndex = 1,
            difficulty = Difficulty.EASY,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "The Battle of Hastings in 1066 was fought in which country?",
            answers = listOf("France", "England", "Germany", "Spain"),
            correctAnswerIndex = 1,
            difficulty = Difficulty.EASY,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "What is the name of the first successfully cloned mammal?",
            answers = listOf("Molly", "Dolly", "Polly", "Lolly"),
            correctAnswerIndex = 1,
            difficulty = Difficulty.EASY,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Which empire was ruled by Genghis Khan?",
            answers = listOf("Roman Empire", "Ottoman Empire", "British Empire", "Mongol Empire"),
            correctAnswerIndex = 3,
            difficulty = Difficulty.EASY,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "What historical period followed the Middle Ages?",
            answers = listOf("Renaissance", "Victorian Era", "Prehistoric Times", "Modern Era"),
            correctAnswerIndex = 0,
            difficulty = Difficulty.EASY,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Who was the Egyptian queen famously associated with Julius Caesar and Mark Antony?",
            answers = listOf("Cleopatra", "Nefertiti", "Hatshepsut", "Isis"),
            correctAnswerIndex = 0,
            difficulty = Difficulty.EASY,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "The ancient city of Rome was built on how many hills?",
            answers = listOf("Seven", "Five", "Nine", "Twelve"),
            correctAnswerIndex = 0,
            difficulty = Difficulty.EASY,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Which U.S. President signed the Emancipation Proclamation?",
            answers = listOf("Abraham Lincoln", "George Washington", "Thomas Jefferson", "Franklin D. Roosevelt"),
            correctAnswerIndex = 0,
            difficulty = Difficulty.NORMAL,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "The Treaty of Versailles ended which conflict?",
            answers = listOf("World War II", "The Napoleonic Wars", "World War I", "The Crimean War"),
            correctAnswerIndex = 2,
            difficulty = Difficulty.NORMAL,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Which civilization is known for the creation of the Code of Hammurabi?",
            answers = listOf("Roman", "Egyptian", "Babylonian", "Greek"),
            correctAnswerIndex = 2,
            difficulty = Difficulty.NORMAL,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Who was the British Prime Minister at the start of World War II?",
            answers = listOf("Winston Churchill", "Neville Chamberlain", "Clement Attlee", "Margaret Thatcher"),
            correctAnswerIndex = 1,
            difficulty = Difficulty.NORMAL,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "What year did the Berlin Wall fall?",
            answers = listOf("1989", "1985", "1991", "1980"),
            correctAnswerIndex = 0,
            difficulty = Difficulty.NORMAL,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Who was the first woman to fly solo across the Atlantic Ocean?",
            answers = listOf("Harriet Quimby", "Bessie Coleman", "Amelia Earhart", "Jacqueline Cochran"),
            correctAnswerIndex = 2,
            difficulty = Difficulty.NORMAL,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "The Magna Carta was signed in which year?",
            answers = listOf("1215", "1066", "1492", "1415"),
            correctAnswerIndex = 0,
            difficulty = Difficulty.NORMAL,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Who was the first Emperor of Rome?",
            answers = listOf("Julius Caesar", "Augustus", "Nero", "Caligula"),
            correctAnswerIndex = 1,
            difficulty = Difficulty.NORMAL,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "The Battle of Gettysburg was fought during which war?",
            answers = listOf("The American Revolutionary War", "The War of 1812", "The American Civil War", "World War I"),
            correctAnswerIndex = 2,
            difficulty = Difficulty.NORMAL,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "What ancient city was destroyed by a volcanic eruption in 79 AD?",
            answers = listOf("Athens", "Rome", "Pompeii", "Sparta"),
            correctAnswerIndex = 2,
            difficulty = Difficulty.NORMAL,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Which country did Queen Victoria rule over?",
            answers = listOf("France", "Russia", "United Kingdom", "Germany"),
            correctAnswerIndex = 2,
            difficulty = Difficulty.NORMAL,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Who was the leader of the Soviet Union during World War II?",
            answers = listOf("Vladimir Lenin", "Joseph Stalin", "Mikhail Gorbachev", "Nikita Khrushchev"),
            correctAnswerIndex = 1,
            difficulty = Difficulty.NORMAL,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "The ancient city of Troy was located in which modern-day country?",
            answers = listOf("Greece", "Italy", "Turkey", "Egypt"),
            correctAnswerIndex = 2,
            difficulty = Difficulty.NORMAL,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Which explorer is credited with discovering the New World in 1492?",
            answers = listOf("Amerigo Vespucci", "Ferdinand Magellan", "Christopher Columbus", "Marco Polo"),
            correctAnswerIndex = 2,
            difficulty = Difficulty.NORMAL,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "What was the main cause of the French Revolution?",
            answers = listOf("Religious conflicts", "Economic hardship", "Foreign invasion", "Royal succession"),
            correctAnswerIndex = 1,
            difficulty = Difficulty.NORMAL,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Which U.S. amendment abolished slavery?",
            answers = listOf("The 10th Amendment", "The 13th Amendment", "The 15th Amendment", "The 18th Amendment"),
            correctAnswerIndex = 1,
            difficulty = Difficulty.NORMAL,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Who was the first female Prime Minister of the United Kingdom?",
            answers = listOf("Margaret Thatcher", "Indira Gandhi", "Angela Merkel", "Benazir Bhutto"),
            correctAnswerIndex = 0,
            difficulty = Difficulty.NORMAL,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "The Renaissance period began in which country?",
            answers = listOf("France", "England", "Germany", "Italy"),
            correctAnswerIndex = 3,
            difficulty = Difficulty.NORMAL,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "The Hundred Years' War was fought between which two countries?",
            answers = listOf("France and England", "Germany and France", "Spain and Portugal", "England and Spain"),
            correctAnswerIndex = 0,
            difficulty = Difficulty.NORMAL,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Who wrote the Declaration of Independence?",
            answers = listOf("George Washington", "Benjamin Franklin", "John Adams", "Thomas Jefferson"),
            correctAnswerIndex = 3,
            difficulty = Difficulty.NORMAL,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "What was the original name of New York City?",
            answers = listOf("New Amsterdam", "New London", "New Paris", "New Berlin"),
            correctAnswerIndex = 0,
            difficulty = Difficulty.HARD,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Who was the longest-reigning British monarch before Queen Elizabeth II?",
            answers = listOf("Queen Victoria", "King George III", "Queen Mary", "King Henry VIII"),
            correctAnswerIndex = 0,
            difficulty = Difficulty.HARD,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Which Pharaoh led the construction of the majority of the Pyramids at Giza?",
            answers = listOf("Khufu", "Ramses II", "Tutankhamun", "Thutmose III"),
            correctAnswerIndex = 0,
            difficulty = Difficulty.HARD,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "What was the name of the first artificial Earth satellite, launched by the Soviet Union?",
            answers = listOf("Sputnik", "Vostok", "Mir", "Luna"),
            correctAnswerIndex = 0,
            difficulty = Difficulty.HARD,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "In which war did the Battle of Bunker Hill take place?",
            answers = listOf("The American Revolutionary War", "The Civil War", "World War I", "The French and Indian War"),
            correctAnswerIndex = 0,
            difficulty = Difficulty.HARD,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Which ancient civilization used the concept of zero for the first time?",
            answers = listOf("The Greeks", "The Romans", "The Egyptians", "The Mayans"),
            correctAnswerIndex = 3,
            difficulty = Difficulty.HARD,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "The Punic Wars were fought between which two ancient empires?",
            answers = listOf("Greek and Persian", "Roman and Carthaginian", "Egyptian and Hittite", "Macedonian and Persian"),
            correctAnswerIndex = 1,
            difficulty = Difficulty.HARD,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "What was the capital of the Byzantine Empire?",
            answers = listOf("Athens", "Rome", "Constantinople", "Alexandria"),
            correctAnswerIndex = 2,
            difficulty = Difficulty.HARD,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Who was the first Tsar of Russia?",
            answers = listOf("Peter the Great", "Ivan the Terrible", "Catherine the Great", "Alexander I"),
            correctAnswerIndex = 1,
            difficulty = Difficulty.HARD,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Which medieval philosopher is known for the quote 'I think, therefore I am'?",
            answers = listOf("Aristotle", "Plato", "Socrates", "René Descartes"),
            correctAnswerIndex = 3,
            difficulty = Difficulty.HARD,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "The Edict of Milan, which proclaimed religious toleration in the Roman Empire, was issued in which year?",
            answers = listOf("212 AD", "313 AD", "1095 AD", "1453 AD"),
            correctAnswerIndex = 1,
            difficulty = Difficulty.HARD,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Who was the first female pharaoh of Egypt?",
            answers = listOf("Nefertiti", "Hatshepsut", "Cleopatra", "Sobekneferu"),
            correctAnswerIndex = 1,
            difficulty = Difficulty.HARD,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "The Rosetta Stone, key to deciphering Egyptian hieroglyphs, was written in how many scripts?",
            answers = listOf("Two", "Three", "Four", "Five"),
            correctAnswerIndex = 1,
            difficulty = Difficulty.HARD,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "What famous structure began construction in 1173 in the Italian city of Pisa?",
            answers = listOf("Colosseum", "Leaning Tower of Pisa", "Duomo of Florence", "Sistine Chapel"),
            correctAnswerIndex = 1,
            difficulty = Difficulty.HARD,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "In which battle did Napoleon Bonaparte suffer a decisive defeat ending his rule?",
            answers = listOf("Battle of Trafalgar", "Battle of Waterloo", "Battle of Leipzig", "Battle of Austerlitz"),
            correctAnswerIndex = 1,
            difficulty = Difficulty.HARD,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "The Spanish Armada attempted to invade which country in 1588?",
            answers = listOf("England", "France", "Portugal", "Italy"),
            correctAnswerIndex = 0,
            difficulty = Difficulty.HARD,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Which Chinese dynasty is known for constructing the majority of the Great Wall?",
            answers = listOf("Qin Dynasty", "Han Dynasty", "Ming Dynasty", "Tang Dynasty"),
            correctAnswerIndex = 2,
            difficulty = Difficulty.HARD,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Who was the longest reigning monarch of the French Empire?",
            answers = listOf("Napoleon Bonaparte", "Louis XIV", "Charles de Gaulle", "Louis XVI"),
            correctAnswerIndex = 1,
            difficulty = Difficulty.HARD,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "The ancient Library of Alexandria was located in which country?",
            answers = listOf("Greece", "Italy", "Egypt", "Persia"),
            correctAnswerIndex = 2,
            difficulty = Difficulty.HARD,
            topic = Topic.HISTORY
        ),
        TriviaQuestion(
            question = "Who was the first Roman emperor to convert to Christianity?",
            answers = listOf("Augustus", "Nero", "Constantine the Great", "Julius Caesar"),
            correctAnswerIndex = 2,
            difficulty = Difficulty.HARD,
            topic = Topic.HISTORY
        )
    )
}