package entity

import value.Location
import value.Piece
import java.util.UUID

class Board(override val id: UUID, private val squares: List<Square>): Entity<Board>(id) {

  fun movePiece(piece: Piece, location: Location) {
    val square = getSquareBy(location)
    square.removePiece()
    square.putPiece(piece)
  }

  fun canMakeMove(piece: Piece, location: Location) {
    val currentSquare = getSquareBy(piece)
    val destinationSquare = getSquareBy(location)

  }

  private fun getSquareBy(piece: Piece) = squares.first { it.piece == piece }
  private fun getSquareBy(location: Location) = squares.first { it.location == location }

  companion object {
    fun empty() = Board(
      id = UUID.randomUUID(),
      squares = listOf(
        Square(Location.fromNotation("A1")),
        Square(Location.fromNotation("B1")),
        Square(Location.fromNotation("C1")),
        Square(Location.fromNotation("D1")),
        Square(Location.fromNotation("E1")),
        Square(Location.fromNotation("F1")),
        Square(Location.fromNotation("G1")),
        Square(Location.fromNotation("H1")),
        Square(Location.fromNotation("A2")),
        Square(Location.fromNotation("B2")),
        Square(Location.fromNotation("C2")),
        Square(Location.fromNotation("D2")),
        Square(Location.fromNotation("E2")),
        Square(Location.fromNotation("F2")),
        Square(Location.fromNotation("G2")),
        Square(Location.fromNotation("H2")),
        Square(Location.fromNotation("A7")),
        Square(Location.fromNotation("B7")),
        Square(Location.fromNotation("C7")),
        Square(Location.fromNotation("D7")),
        Square(Location.fromNotation("E7")),
        Square(Location.fromNotation("F7")),
        Square(Location.fromNotation("G7")),
        Square(Location.fromNotation("H7")),
        Square(Location.fromNotation("A8")),
        Square(Location.fromNotation("B8")),
        Square(Location.fromNotation("C8")),
        Square(Location.fromNotation("D8")),
        Square(Location.fromNotation("E8")),
        Square(Location.fromNotation("F8")),
        Square(Location.fromNotation("G8")),
        Square(Location.fromNotation("H8"))
      )
    )

    fun startingPosition() = Board(
      id = UUID.randomUUID(),
      squares = listOf(
        Square(Location.fromNotation("A1"), Piece(side = Piece.Side.White, type = Piece.Type.Rook)),
        Square(Location.fromNotation("B1"), Piece(side = Piece.Side.White, type = Piece.Type.Knight)),
        Square(Location.fromNotation("C1"), Piece(side = Piece.Side.White, type = Piece.Type.Bishop)),
        Square(Location.fromNotation("D1"), Piece(side = Piece.Side.White, type = Piece.Type.Queen)),
        Square(Location.fromNotation("E1"), Piece(side = Piece.Side.White, type = Piece.Type.King)),
        Square(Location.fromNotation("F1"), Piece(side = Piece.Side.White, type = Piece.Type.Bishop)),
        Square(Location.fromNotation("G1"), Piece(side = Piece.Side.White, type = Piece.Type.Knight)),
        Square(Location.fromNotation("H1"), Piece(side = Piece.Side.White, type = Piece.Type.Rook)),
        Square(Location.fromNotation("A2"), Piece(side = Piece.Side.White, type = Piece.Type.Pawn)),
        Square(Location.fromNotation("B2"), Piece(side = Piece.Side.White, type = Piece.Type.Pawn)),
        Square(Location.fromNotation("C2"), Piece(side = Piece.Side.White, type = Piece.Type.Pawn)),
        Square(Location.fromNotation("D2"), Piece(side = Piece.Side.White, type = Piece.Type.Pawn)),
        Square(Location.fromNotation("E2"), Piece(side = Piece.Side.White, type = Piece.Type.Pawn)),
        Square(Location.fromNotation("F2"), Piece(side = Piece.Side.White, type = Piece.Type.Pawn)),
        Square(Location.fromNotation("G2"), Piece(side = Piece.Side.White, type = Piece.Type.Pawn)),
        Square(Location.fromNotation("H2"), Piece(side = Piece.Side.White, type = Piece.Type.Pawn)),
        Square(Location.fromNotation("A7"), Piece(side = Piece.Side.Black, type = Piece.Type.Pawn)),
        Square(Location.fromNotation("B7"), Piece(side = Piece.Side.Black, type = Piece.Type.Pawn)),
        Square(Location.fromNotation("C7"), Piece(side = Piece.Side.Black, type = Piece.Type.Pawn)),
        Square(Location.fromNotation("D7"), Piece(side = Piece.Side.Black, type = Piece.Type.Pawn)),
        Square(Location.fromNotation("E7"), Piece(side = Piece.Side.Black, type = Piece.Type.Pawn)),
        Square(Location.fromNotation("F7"), Piece(side = Piece.Side.Black, type = Piece.Type.Pawn)),
        Square(Location.fromNotation("G7"), Piece(side = Piece.Side.Black, type = Piece.Type.Pawn)),
        Square(Location.fromNotation("H7"), Piece(side = Piece.Side.Black, type = Piece.Type.Pawn)),
        Square(Location.fromNotation("A8"), Piece(side = Piece.Side.Black, type = Piece.Type.Rook)),
        Square(Location.fromNotation("B8"), Piece(side = Piece.Side.Black, type = Piece.Type.Knight)),
        Square(Location.fromNotation("C8"), Piece(side = Piece.Side.Black, type = Piece.Type.Bishop)),
        Square(Location.fromNotation("D8"), Piece(side = Piece.Side.Black, type = Piece.Type.Queen)),
        Square(Location.fromNotation("E8"), Piece(side = Piece.Side.Black, type = Piece.Type.King)),
        Square(Location.fromNotation("F8"), Piece(side = Piece.Side.Black, type = Piece.Type.Bishop)),
        Square(Location.fromNotation("G8"), Piece(side = Piece.Side.Black, type = Piece.Type.Knight)),
        Square(Location.fromNotation("H8"), Piece(side = Piece.Side.Black, type = Piece.Type.Rook))
      )
    )
  }
}
