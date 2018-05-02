fun main(args: Array<String>) {
    val questions = initQuestions()
}


fun initQuestions(): Array<Kanji> {
    val questionList = arrayOf<Kanji>()
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
        questionList[i] = kanji
    }

    return questionList
}