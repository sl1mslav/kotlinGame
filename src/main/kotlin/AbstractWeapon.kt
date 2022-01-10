import FireType.BurstFire

abstract class AbstractWeapon {
    abstract val maxClipSize: Int
    abstract val fireType: FireType
    var magAmmo: Stack<Ammo> = Stack()
    private set
    fun hasAmmo(): Boolean = !magAmmo.isEmpty()

    abstract fun createAmmo(): Ammo

    private fun createAmmo(ammoType: Ammo): Ammo = ammoType

    fun reload() {
        magAmmo = Stack<Ammo>()
        for (i in 0 until maxClipSize) {
            magAmmo.push(createAmmo())
        }
    }

    fun getAmmo(): MutableList<Ammo?> {
        val ammoToReturn = mutableListOf<Ammo?>()
        when (fireType) {
            FireType.SingleFire -> if (hasAmmo()) {
                ammoToReturn.add(magAmmo.pop())
            }
            is BurstFire -> {
                if (hasAmmo()) {
                    for (i in 0 until (fireType as BurstFire).burstSize) {
                        ammoToReturn.add(magAmmo.pop())
                    }
                }
            }
            FireType.AutomaticFire -> if (hasAmmo()) {
                while (hasAmmo())
                    ammoToReturn.add(magAmmo.pop())
            }
        }
        return ammoToReturn
    }
}
