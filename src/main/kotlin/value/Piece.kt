package value

data class Piece(val type: Type) {
  enum class Type(val abbreviation: String) {
    Rook("R")
  }
}
