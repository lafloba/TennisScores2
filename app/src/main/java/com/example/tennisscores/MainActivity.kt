package com.example.tennisscores

import TennisScoresPresenter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity(override var threeSetsButton: Button, override var fiveSetsButton: Button) : AppCompatActivity(), ITennisScores{

    lateinit var presenter : TennisScoresPresenter
    lateinit var pointAButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pointAButton = findViewById(R.id.pointA)
        pointAButton.setOnClickListener { presenter.onAPointScored() }
    }


    override fun displayScores(score: String, score2: String): String {
        TODO("Not yet implemented")
    }

    override fun displaySetResults(result: String, result2: String): String {
        TODO("Not yet implemented")
    }

    override fun displayGames(game: String, game2: String): String {
        TODO("Not yet implemented")
    }

    override fun displayPoints(point: String, point2: String): String {
        TODO("Not yet implemented")
    }

    override var isMaxSetsEnabled: Boolean
        get() = threeSetsButton.isEnabled && fiveSetsButton.isEnabled
        set(value) {
            threeSetsButton.isEnabled = value
            fiveSetsButton.isEnabled = value
        }


}