package chapter6.liskov

class Money(
    private val value: Int
) {
    fun add(other: Money): Money {
        return Money(value + other.value)
    }
}