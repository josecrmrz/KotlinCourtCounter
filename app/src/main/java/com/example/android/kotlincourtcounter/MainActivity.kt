package com.example.android.kotlincourtcounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        three_points.setOnClickListener {
            threePoints()
        }

        two_points.setOnClickListener {
            twoPoints()
        }

        free_throw.setOnClickListener {
            freeThrow()
        }

        displayForTeamA(6)
    }

    /**
     * Displays the given score for Team A.
     */
    private fun displayForTeamA(score: Int) {
        team_a_score.text = score.toString()
    }

    fun threePoints() {
        team_a_score.text = 3.toString()
    }

    fun twoPoints() {
        team_a_score.text = 2.toString()
    }

    fun freeThrow() {
        team_a_score.text = 1.toString()
    }
}
