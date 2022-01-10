class Sniper : AbstractWarrior() {
    override val maxHP: Double = 75.0
    override val accuracy: Int = 42
    override val weapon: AbstractWeapon = Weapons.createSniper()
    override var currentHP: Double = maxHP
    override var isKilled: Boolean = false
    override val evasionChance: Int = 68
}