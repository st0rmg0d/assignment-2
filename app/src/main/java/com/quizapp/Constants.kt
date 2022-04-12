package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Whose ability is this?",
            R.drawable.jett_dash,
            "Jett", "Brimstone",
            "Phoenix", "Yoru", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Whose ability is this?",
            R.drawable.sage_slow,
            "Killjoy", "Skye",
            "Sage", "Astra", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Whose ability is this?",
            R.drawable.breach_aftershock,
            "Omen", "Viper",
            "Neon", "Breach", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Whose ability is this?",
            R.drawable.sova_ult,
            "Cypher", "Sova",
            "Raze", "Reyna", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Whose ability is this?",
            R.drawable.omen_ult,
            "Brimstone", "Chamber",
            "Omen", "Viper", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Whose ability is this?",
            R.drawable.sage_wall,
            "Sage", "Jett",
            "Breach", "none of these", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Whose ability is this?",
            R.drawable.phoenix_flash,
            "Neon", "Yoru",
            "Phoenix", "Chamber", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Whose ability is this?",
            R.drawable.cypher_cage,
            "Astra", "Viper",
            "KAY/O", "Cypher", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Whose ability is this?",
            R.drawable.omen_tp,
            "Reyna", "Omen",
            "Skye", "none of these", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Whose ability is this?",
            R.drawable.raze_ult,
            "Raze", "Killjoy",
            "Yoru", "Astra", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}