fun main(args: Array<String>) {
    var questions = initQuestions().toMutableList()
    var userAnswer: String
    var score = 0
    questions = shuffleKanji(questions)
    println("Welcome to Kotlin Kanji!")
    for(question in questions) {
        println("What is the english meaning of ${question.name} ?")
        userAnswer = readLine()!!
        if (userAnswer == question.englishMeaning.toLowerCase()) {
            score++
            println("Looks like that was the correct answer onto the next question!\n")
        } else {
            println("Looks like you entered an incorrect answer try again!\n")
        }
    }
    println("Thanks for playing your final score was: $score")
}



fun initQuestions(): MutableList<Kanji> {
    val questionList:  MutableList<Kanji> = mutableListOf()
    var kanji = Kanji("","")
    for (i in 0..7) {
        when (i) {
            0 -> kanji = Kanji("日", "sun")
            1 -> kanji = Kanji("一", "one")
            2 -> kanji = Kanji("大", "big")
            3 -> kanji = Kanji("年", "year")
            4 -> kanji = Kanji("中", "middle")
            5 -> kanji = Kanji("会", "meet")
            6 -> kanji = Kanji("人", "person")
            7 -> kanji = Kanji("本", "book")
        }
        questionList.add(i, kanji)
    }
    return questionList
}

fun shuffleKanji(questions: MutableList<Kanji>): MutableList<Kanji> {
    questions.shuffle()
    return questions
}