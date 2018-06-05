package com.mtw.kary.basquetapp

class Team {
    var totalPoints:Int = 0

    fun treePointsBasket () {
        totalPoints += 3
    }

    fun twoPointsBasket () {
        totalPoints += 2
    }

    fun onePointBasket () {
        totalPoints += 1
    }

    fun resetPoints () {
        totalPoints = 0
    }

}