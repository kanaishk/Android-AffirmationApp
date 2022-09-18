package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class DataSource {
    fun loadAffirmations() : MutableList<Affirmation> {
        return mutableListOf<Affirmation>(
            Affirmation(R.string.affirmation_1),
            Affirmation(R.string.affirmation_2),
            Affirmation(R.string.affirmation_3),
            Affirmation(R.string.affirmation_4),
            Affirmation(R.string.affirmation_5),
            Affirmation(R.string.affirmation_6),
            Affirmation(R.string.affirmation_7),
            Affirmation(R.string.affirmation_8),
            Affirmation(R.string.affirmation_9),
            Affirmation(R.string.affirmation_10)
        )
    }
}