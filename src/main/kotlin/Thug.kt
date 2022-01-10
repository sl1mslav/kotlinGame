class Thug: AbstractWarrior() {
    override val maxHP: Double = 40.0
    override val accuracy: Int = 64
    override val weapon: AbstractWeapon = Weapons.createUzi()
    override var currentHP: Double = maxHP
    override var isKilled: Boolean = false
    override val evasionChance: Int = 62
}