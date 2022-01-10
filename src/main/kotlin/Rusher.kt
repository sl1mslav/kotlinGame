class Rusher: AbstractWarrior() {
    override val maxHP: Double = 60.0
    override val accuracy: Int = 50
    override val weapon: AbstractWeapon = Weapons.createShotgun()
    override var currentHP: Double = maxHP
    override var isKilled: Boolean = false
    override val evasionChance: Int = 55
}