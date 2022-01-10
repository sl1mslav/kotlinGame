class Scout: AbstractWarrior() {
    override val maxHP: Double = 125.0
    override val accuracy: Int = 80
    override val weapon: AbstractWeapon = Weapons.createPistol()
    override var currentHP: Double = maxHP
    override var isKilled: Boolean = false
    override val evasionChance: Int = 46
}