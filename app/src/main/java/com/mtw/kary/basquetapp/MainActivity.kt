package com.mtw.kary.basquetapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val teamA : Team = Team()
    val teamB : Team = Team()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    //Metodos para Team A ,Unit = void en java

    fun btn3PA (view: View) : Unit {
    teamA.treePointsBasket()
        setScoreTeamA()


    }

    fun btn2PA (view: View) : Unit {
        teamA.twoPointsBasket()
        setScoreTeamA()

    }

    fun btnFTA (view: View) : Unit {
     teamA.onePointBasket()
        setScoreTeamA()

    }


    private fun setScoreTeamA(){
        txtScoreA.text = teamA.totalPoints.toString()
    }

    //Metodos para Team B ,Unit = void en java

    fun btn3PB (view: View) : Unit {
        teamB.treePointsBasket()
        setScoreTeamB()


    }

    fun btn2PB (view: View) : Unit {
        teamB.twoPointsBasket()
        setScoreTeamB()

    }

    fun btnFTB (view: View) : Unit {
        teamB.onePointBasket()
        setScoreTeamB()

    }

    private fun setScoreTeamB(){
        txtScoreB.text = teamB.totalPoints.toString()
    }

    fun btnReset (view: View) : Unit {
        teamA.resetPoints()
        teamB.resetPoints()
        setScoreTeamA()
        setScoreTeamB()

}
}


