import entity.Game
import java.util.UUID

fun main(args: Array<String>) {
  println("Hello World!")

  // Try adding program arguments via Run/Debug configuration.
  // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
  println("Program arguments: ${args.joinToString()}")

  Game(UUID.randomUUID())


}

/*


Command:
- DoMove(targetLocation)

Aggregate:
- Game
  - Board
    - List<Square>

Entity:
  - Square
    - Rank
    - File
    - Piece?

Value type:
  - Rank
  - File
  - Piece
    - Type

 */
