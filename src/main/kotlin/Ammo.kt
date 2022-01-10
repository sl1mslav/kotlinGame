enum class Ammo(private val damage: Double, private val critical: Int, private val coefficient: Double) {
    Bullets(10.0, 15, 1.34),
    Slugs(37.0, 5, 2.28),
    ExpansiveBullets(17.0, 10, 1.39),
    SniperBullets(52.0, 6, 1.76);

    fun calcDamage(): Double {
        return if (critical.randomChance()) damage * coefficient else damage
    }
}