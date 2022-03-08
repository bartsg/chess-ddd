package entity

abstract class Entity<T: Any>(open val id: Any) {

  override fun equals(other: Any?) = javaClass == other?.javaClass && id == (other as? Entity<*>)?.id

  override fun hashCode(): Int = id.hashCode()
}


