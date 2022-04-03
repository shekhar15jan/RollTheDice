package com.trainings.rollthedice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

/**
 * This Activity Allow user to roll the dice and view the result
 * on the screen
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.btnRollDice)
        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Roll the Dice upon roll button click
     */
    private fun rollDice() {
        val dice = Dice(6)
        val rollResult = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView4)

        val diceRoll = when (rollResult) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(diceRoll)
    }
}

/**
 * Dice works on multiple sides
 */
class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}