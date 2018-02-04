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
        /**
         * Team A onClick listeners
         */
        team_a_touchdown.setOnClickListener { teamATouchdown() }
        team_a_field_goal.setOnClickListener { teamAFieldGoal() }
        team_a_extra_point.setOnClickListener { teamAExtraPoint() }
        team_a_safety.setOnClickListener { teamASafety() }

        /**
         * Team B onClick listeners
         */
        team_b_touchdown.setOnClickListener { teamBTouchdown() }
        team_b_field_goal.setOnClickListener { teamBFieldGoal() }
        team_b_extra_point.setOnClickListener { teamBExtraPoint() }
        team_b_safety.setOnClickListener { teamBSafety() }

        /**
         * Reset onClick listeners
         */
        reset_button.setOnClickListener { resetScores() }

        displayForTeamA(scoreForTeamA)
        displayForTeamB(scoreForTeamB)
    }

    /**
     * Team A Methods
     */
    private fun displayForTeamA(score: Int) {
        team_a_score.text = score.toString()
    }

    private fun teamATouchdown() {
        scoreForTeamA += 6

        displayForTeamA(scoreForTeamA)
    }

    private fun teamAFieldGoal() {
        scoreForTeamA += 3

        displayForTeamA(scoreForTeamA)
    }

    private fun teamAExtraPoint() {
        scoreForTeamA += 1

        displayForTeamA(scoreForTeamA)
    }

    private fun teamASafety() {
        scoreForTeamA += 2

        displayForTeamA(scoreForTeamA)
    }

    /**
     * Team B Methods
     */
    private fun displayForTeamB(score: Int) {
        team_b_score.text = score.toString()
    }

    private fun teamBTouchdown() {
        scoreForTeamB += 6

        displayForTeamB(scoreForTeamB)
    }

    private fun teamBFieldGoal() {
        scoreForTeamB += 3

        displayForTeamB(scoreForTeamB)
    }

    private fun teamBExtraPoint() {
        scoreForTeamB += 1

        displayForTeamB(scoreForTeamB)
    }

    private fun teamBSafety() {
        scoreForTeamB += 2

        displayForTeamB(scoreForTeamB)
    }

    /**
     * Reset team scores to 0
     */
    private fun resetScores() {
        scoreForTeamA = 0
        scoreForTeamB = 0

        displayForTeamA(scoreForTeamA)
        displayForTeamB(scoreForTeamB)
    }
}
