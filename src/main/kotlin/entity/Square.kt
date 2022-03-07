package entity

import value.File
import value.Piece
import value.Rank

data class Square(
  var piece: Piece?,
  val rank: Rank,
  val file: File,
  override val id: String = "${rank.number}_${file.name}"
): Entity(id) {

  fun removePiece() {
    piece = null
  }

  fun putPiece(piece: Piece) {
    this.piece?.let { throw IllegalStateException("Square already occupied by ${this.piece}") }
    this.piece = piece
  }
}
