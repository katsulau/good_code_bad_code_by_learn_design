package chapter6.policy

class GoldCustomerPurchaseAmountRule: ExcellentCustomerRule {
    override fun ok(history: PurchaseHistory): Boolean {
        return 100000 <= history.getTotalAmount()
    }
}