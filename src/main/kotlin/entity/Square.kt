package entity

import value.Location
import value.Piece

data class Square(
  val location: Location,
  var piece: Piece? = null,
  override val id: String = location.id as String
): Entity<Square>(id) {

  fun removePiece() {
    piece = null
  }

  fun putPiece(piece: Piece) {
    this.piece?.let { throw IllegalStateException("Square already occupied by ${this.piece}") }
    this.piece = piece
  }
}
