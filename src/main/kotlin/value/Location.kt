package value

import entity.Entity

data class Location(val file: File, val rank: Rank): Entity<Location>(id = "${file.name}${rank.number}") {

  companion object {
    fun fromNotation(notation: String) = Location(
      File.valueOf("${notation.first()}"),
      Rank.fromNumber(notation.last().digitToInt())
    )
  }
}
