package com.example.android.kotlincourtcounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var scoreForTeamA: Int = 0
    private var scoreForTeamB: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Team A on click listeners
        team_a_three_points.setOnClickListener {
            teamAThreePoints()
        }

        team_a_two_points.setOnClickListener {
            teamATwoPoints()
        }

        team_a_free_throw.setOnClickListener {
            teamAFreeThrow()
        }

        // Team B on click listeners

        team_b_three_points.setOnClickListener {
            teamBThreePoints()
        }

        team_b_two_points.setOnClickListener {
            teamBTwoPoints()
        }

        team_b_free_throw.setOnClickListener {
            teamBFreeThrow()
        }

        displayForTeamA(scoreForTeamA)
        displayForTeamB(scoreForTeamB)
    }

    /**
     * Team A Methods
     */
    private fun displayForTeamA(score: Int) {
        team_a_score.text = score.toString()
    }

    private fun teamAThreePoints() {
        scoreForTeamA += 3

        displayForTeamA(scoreForTeamA)
    }

    private fun teamATwoPoints() {
        scoreForTeamA += 2

        displayForTeamA(scoreForTeamA)
    }

    private fun teamAFreeThrow() {
        scoreForTeamA += 1

        displayForTeamA(scoreForTeamA)
    }

    /**
     * Team B Methods
     */
    private fun displayForTeamB(score: Int) {
        team_b_score.text = score.toString()
    }

    private fun teamBThreePoints() {
        scoreForTeamB += 3

        displayForTeamB(scoreForTeamB)
    }

    private fun teamBTwoPoints() {
        scoreForTeamB += 2

        displayForTeamB(scoreForTeamB)
    }

    private fun teamBFreeThrow() {
        scoreForTeamB += 1

        displayForTeamB(scoreForTeamB)
    }
}
