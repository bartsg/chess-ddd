package value

import value.Rank.Companion.fromNumber

enum class File {
  A,
  B,
  C,
  D,
  E,
  F,
  G,
  H;

  operator fun minus(files: Int) = values().first { it.ordinal == ordinal - files }
  operator fun plus(files: Int) = values().first { it.ordinal == ordinal + files }
}

