package value.pattern

import entity.Entity

data class MoveRule(
  val type: MoveType,
  val pattern: MovePattern,
  ): Entity<MoveRule>("${type.name}_${pattern.id}")
