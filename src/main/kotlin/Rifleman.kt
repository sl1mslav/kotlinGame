class Rifleman : AbstractWarrior() {
    override val maxHP: Double = 100.0
    override val accuracy: Int = 35
    override val weapon: AbstractWeapon = Weapons.createAR()
    override var currentHP: Double = maxHP
    override var isKilled: Boolean = false
    override val evasionChance: Int = 30
}