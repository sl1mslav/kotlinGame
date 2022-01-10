sealed class FireType {
    object SingleFire : FireType()
    data class BurstFire(val burstSize: Int) : FireType()
    // fires all bullets in clip
    object AutomaticFire : FireType()
}

