package chapter6.policy

class SilverCustomerPolicy(
    private val policy: ExcellentCustomerPolicy
) {
    companion object {
        fun of(): SilverCustomerPolicy {
            val rules = setOf(
                PurchaseFrequencyRule(),
                ReturnRateRule(),
            )
            val policy = ExcellentCustomerPolicy.of(rules)
            return SilverCustomerPolicy(policy)
        }
    }

    fun complyWithAll(history: PurchaseHistory): Boolean {
        return policy.complyWithAll(history)
    }
}