package value

import entity.Entity
import value.pattern.MovePattern
import value.pattern.MoveRule
import value.pattern.MoveType

class Piece(val type: Type, val side: Side, vararg allowedMoves: MoveRule): Entity<Piece>("${type.name}_${side.name}") {
  enum class Type(val abbreviation: String) {
    King("K"),
    Queen("Q"),
    Bishop("B"),
    Rook("R"),
    Knight("N"),
    Pawn("-")
  }

  enum class Side {
    Black,
    White
  }

  fun possibleMoves(): List<Location> {
    // TODO: Possible moves and patterns per piece
    return emptyList()
  }
}
