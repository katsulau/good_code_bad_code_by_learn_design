package chapter6.policy

class PurchaseHistory(
    private val totalAmount: Int,
    private val returnRate: Float,
    private val purchaseFrequencyPerMonth: Int
) {
    fun getTotalAmount(): Int {
        return totalAmount
    }

    fun getPurchaseFrequencyPerMonth(): Int {
        return purchaseFrequencyPerMonth
    }

    fun getReturnRate(): Float {
        return returnRate
    }
}