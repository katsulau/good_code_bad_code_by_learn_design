package chapter6.policy

class ExcellentCustomerPolicy private constructor(
    private val rules: Set<ExcellentCustomerRule>
) {
    companion object {
        fun of(rules: Set<ExcellentCustomerRule>): ExcellentCustomerPolicy {
            return ExcellentCustomerPolicy(rules)
        }
    }

    fun complyWithAll(purchaseHistory: PurchaseHistory): Boolean {
        rules.forEach{ rule ->
            if(!rule.ok(purchaseHistory)) {
                return false
            }
        }

        return true
    }
}