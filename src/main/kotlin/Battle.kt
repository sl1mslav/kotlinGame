import kotlin.random.Random

class Battle {
    private val team1 = Team()
    private val team2 = Team()

    private fun checkLivingWarriors(team: Team): Boolean {
        for (i in team.warriors) {
            if (!i.isKilled)
                return true
        }
        return false
    }

    private fun getBattleState(): BattleState {
        return if (checkLivingWarriors(team1) && checkLivingWarriors(team2))
            BattleState.Progress(team1, team2)
        else if (checkLivingWarriors(team1))
            BattleState.FirstTeamWin
        else if (checkLivingWarriors(team2))
            BattleState.SecondTeamWin
        else
            BattleState.Draw
    }

    private fun iterateBattle() {
        for (i in team1.warriors)
            i.attack(team2.warriors[Random.nextInt(0, 5)])
        for (i in team2.warriors)
            i.attack(team1.warriors[Random.nextInt(0, 5)])
        when {
            getBattleState() == BattleState.FirstTeamWin -> println("First Team won! Hooray!")
            getBattleState() == BattleState.SecondTeamWin -> println("Second Team won! Hooray! ")
            getBattleState() == BattleState.Draw -> println("It's a draw, folks!")
            else -> BattleState.Progress(team1, team2)
        }
    }

    init {
        getBattleState()
        while (checkLivingWarriors(team1) && checkLivingWarriors(team2))
            iterateBattle()
    }
}