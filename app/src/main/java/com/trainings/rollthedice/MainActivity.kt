package com.trainings.rollthedice

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
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
        rollButton.setOnClickListener{ rollDice() }
    }

    /**
     * Roll the Dice upon roll button click
     */
    private fun rollDice() {
        val dice = Dice(6)
        val textVieRollResult: TextView = findViewById(R.id.textRollResult)
        textVieRollResult.text = dice.roll().toString()
    }
}

/**
 * Dice works on multiple sides
 */
class Dice(private val numSides: Int){
    fun roll(): Int{
        return (1..numSides).random()
    }
}