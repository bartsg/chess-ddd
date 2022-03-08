package value.pattern

import entity.Entity
import value.Piece

data class MovePattern(
  val fileModifier: Int,
  val rankModifier: Int
  ): Entity<MovePattern>("${fileModifier}_${rankModifier}") {

    companion object {
      fun up() = MovePattern(0, 1)
      fun down() = MovePattern(0, -1)
      fun upLeft() = MovePattern(-1, 1)
      fun upRight() = MovePattern(1, 1)
      fun downLeft() = MovePattern(-1, -1)
      fun downRight() = MovePattern(1, -1)
    }
  }
