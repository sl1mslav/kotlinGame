object Weapons {
    fun createPistol(): AbstractWeapon {
        return object : AbstractWeapon() {
            override val maxClipSize: Int = 11
            override val fireType: FireType = FireType.SingleFire

            override fun createAmmo(): Ammo = Ammo.Bullets
        }
    }

    fun createShotgun(): AbstractWeapon {
        return object : AbstractWeapon() {
            override val maxClipSize: Int = 6
            override val fireType: FireType = FireType.SingleFire

            override fun createAmmo(): Ammo = Ammo.Slugs
        }
    }

    fun createUzi(): AbstractWeapon {
        return object : AbstractWeapon() {
            override val maxClipSize: Int = 16
            override val fireType: FireType = FireType.AutomaticFire

            override fun createAmmo(): Ammo = Ammo.Bullets
        }
    }

    fun createAR(): AbstractWeapon {
        return object : AbstractWeapon() {
            override val maxClipSize: Int = 21
            override val fireType: FireType = FireType.BurstFire(3)

            override fun createAmmo(): Ammo = Ammo.ExpansiveBullets
        }
    }

    fun createSniper(): AbstractWeapon {
        return object : AbstractWeapon() {
            override val maxClipSize: Int = 7
            override val fireType: FireType = FireType.SingleFire

            override fun createAmmo(): Ammo = Ammo.SniperBullets
        }
    }
}