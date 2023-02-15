package chapter6.policy

class ReturnRateRule: ExcellentCustomerRule {
    override fun ok(history: PurchaseHistory): Boolean {
        return history.getReturnRate() <= 0.001
    }
}