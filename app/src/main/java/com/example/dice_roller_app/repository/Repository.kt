package com.example.dice_roller_app.repository

import com.example.dice_roller_app.utils.DiceValue

object Repository {

    fun getImageRandomDice(): Int? =
        DiceValue.values().iterator().next().randomDice()?.getImageDice()

}