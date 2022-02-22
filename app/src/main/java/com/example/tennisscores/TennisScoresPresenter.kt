import com.example.tennisscores.MainActivity

class TennisScoresPresenter(mainActivity: MainActivity) {
    fun onAPointScored() {
        TODO("Not yet implemented")
    }
    //view.isMaxSetsEnabled = model.atGameBeginning

    enum class ScoreType {
        Normal, Deuce, Advantage, AdvantageOther
    }

    private fun pointsToString(points: Int, type: ScoreType): String {
        return when (type) {
            ScoreType.Normal -> when (points) {
                0 -> "00"
                else -> points.toString()
            }
            ScoreType.Deuce -> "40"
            ScoreType.Advantage -> "Ad"
            ScoreType.AdvantageOther -> "__"
        }
    }

    private fun updateView(points: Int, type: ScoreType) {




        /*view.displayScores("0","0")
        view.displaySetResults("___","___")
        view.displayGames("0","0")
        view.displayPoints("00","00")*/
    }

}

