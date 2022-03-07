package entity

import value.Piece

class Game(override val id: String, val board: Board): Entity(id) {

  fun doMove(piece: Piece, square: Square) = board.movePiece(piece, square)


  fun makeCapture(piece: Piece, square: Square) {

  }
}
