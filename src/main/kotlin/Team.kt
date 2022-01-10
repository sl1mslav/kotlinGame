class Team {
    val warriors = mutableListOf<AbstractWarrior>()

    init {
        for (i in 0 until 5) when {
            15.randomChance() -> warriors.add(Sniper())
            25.randomChance() -> warriors.add(Rifleman())
            45.randomChance() -> warriors.add(Rusher())
            60.randomChance() -> warriors.add(Scout())
            else -> warriors.add(Thug())
        }
    }
}