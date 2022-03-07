package entity

import value.Piece

class Board(override val id: String, private val squares: List<Square>): Entity(id) {

  fun movePiece(piece: Piece, square: Square) {
    val squareFromList = squares.first { square == it }
    squareFromList.removePiece()
    squareFromList.putPiece(piece)
  }
}
