import kotlin.random.Random

fun main() {
    // Battle of the century
    Battle()
}

fun Int.randomChance() : Boolean {
    return this >= Random.nextInt(0, 100)
}
