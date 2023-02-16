package chapter8.price

class RegularPrice private constructor (
    val amount: Int
) {
    companion object {
        private const val MIN_AMOUNT = 0

        fun of(amount: Int): RegularPrice {
            if (amount < MIN_AMOUNT) {
                throw IllegalArgumentException("価格が0以上ではありません")
            }
            return RegularPrice(amount)
        }
    }
}