package chapter6.policy

class PurchaseFrequencyRule: ExcellentCustomerRule {
    override fun ok(history: PurchaseHistory): Boolean {
        return 10 <= history.getPurchaseFrequencyPerMonth()
    }
}