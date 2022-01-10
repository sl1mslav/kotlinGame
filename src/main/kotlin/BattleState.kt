sealed class BattleState {
    data class Progress(val team1: Team, val team2: Team): BattleState() {
        init {
            println("""/-----------------------\""")
            printTeamInfo(team1)
            println()
            printTeamInfo(team2)
            println("""\-----------------------/""")
        }
        private fun printTeamInfo(team: Team) {
            for (i in team.warriors) {
                if (i.isKilled)
                    println("${i.javaClass.name} - Dead")
                else
                    println("${i.javaClass.name} - ${i.currentHP}")
            }
        }
    }
    object FirstTeamWin: BattleState()
    object SecondTeamWin: BattleState()
    object Draw: BattleState()
}
