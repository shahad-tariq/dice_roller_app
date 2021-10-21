package com.example.dice_roller_app.utils

import com.example.dice_roller_app.R
import java.util.*

enum class DiceValue(private var imgDice: Int) {
    ONE(R.drawable.ic_dice_one),
    TWO(R.drawable.ic_dice_twe),
    THREE(R.drawable.ic_dice_three),
    FOUR(R.drawable.ic_dice_four),
    FIVE(R.drawable.ic_dice_five),
    SIX(R.drawable.ic_dice_six);

    fun randomDice(): DiceValue? {
        return values()[SplittableRandom().nextInt(values().size)]
    }

    fun getImageDice(): Int {
        return imgDice
    }

}