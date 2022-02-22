package com.example.tennisscores

import android.widget.Button

interface ITennisScores {
    fun displayScores(score: String, score2:String) : String
    fun displaySetResults(result: String, result2: String) : String
    fun displayGames(game: String, game2: String) : String
    fun displayPoints(point: String, point2: String) : String

    var isMaxSetsEnabled: Boolean
    var threeSetsButton: Button
    var fiveSetsButton: Button
}