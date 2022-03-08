package value

enum class Rank(val number: Int) {
  ONE(1),
  TWO(2),
  THREE(3),
  FOUR(4),
  FIVE(5),
  SIX(6),
  SEVEN(7),
  EIGHT(8);

  operator fun minus(ranks: Int) = Rank.fromNumber(number - ranks)
  operator fun plus(ranks: Int) = Rank.fromNumber(number + ranks)

  companion object {
    fun fromNumber(number: Int) = when(number) {
      1 -> ONE
      2 -> TWO
      3 -> THREE
      4 -> FOUR
      5 -> FIVE
      6 -> SIX
      7 -> SEVEN
      8 -> EIGHT
      else -> throw IllegalArgumentException("Incorrect Rank: $number")
    }
  }
}
