abstract class AbstractWarrior : Warrior {
    abstract val maxHP: Double
    abstract val accuracy: Int
    abstract val weapon: AbstractWeapon
    abstract var currentHP: Double

    override fun attack(warrior: Warrior) {
        var totalDamage: Double = 0.0
        if (!weapon.hasAmmo())
            weapon.reload()
        for (i in weapon.getAmmo()) {
            if (accuracy.randomChance() && !evasionChance.randomChance())
                totalDamage += i?.calcDamage() ?: return
        }
        warrior.takeDamage(totalDamage)
    }

    override fun takeDamage(damageVal: Double) {
        currentHP -= damageVal
        if (currentHP <= 0)
            isKilled = true
    }
}