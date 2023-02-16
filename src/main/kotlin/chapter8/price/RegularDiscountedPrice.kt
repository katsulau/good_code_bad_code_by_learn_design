package chapter8.price

class RegularDiscountedPrice private constructor(
    val amount: Int
) {
    companion object {
        private const val MIN_AMOUNT = 0
        private const val DISCOUNT_AMOUNT = 400

        fun of(regularPrice: RegularPrice): RegularDiscountedPrice {
            val discountedAmount = regularPrice.amount - DISCOUNT_AMOUNT
            val amount = if (discountedAmount > 0) {
                discountedAmount
            } else {
                MIN_AMOUNT
            }

            return RegularDiscountedPrice(amount)
        }
    }
}