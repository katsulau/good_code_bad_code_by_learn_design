package chapter6.policy

class GoldCustomerPolicy private constructor(
    private val policy: ExcellentCustomerPolicy
) {
    companion object {
        fun of(): GoldCustomerPolicy {
            val rules = setOf(
                GoldCustomerPurchaseAmountRule(),
                PurchaseFrequencyRule(),
                ReturnRateRule(),
            )
            val policy = ExcellentCustomerPolicy.of(rules)

            return GoldCustomerPolicy(policy)
        }
    }
    fun complyWithAll(history: PurchaseHistory): Boolean {
        return policy.complyWithAll(history)
    }
}