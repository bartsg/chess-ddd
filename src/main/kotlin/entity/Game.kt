package entity

import value.Location
import value.Piece
import java.util.UUID

class Game(override val id: UUID, private val board: Board = Board.startingPosition()): Entity<Game>(id) {

  fun doMove(piece: Piece, location: Location) = board.movePiece(piece, location)

  fun makeCapture(piece: Piece, location: Location) {

  }
}
