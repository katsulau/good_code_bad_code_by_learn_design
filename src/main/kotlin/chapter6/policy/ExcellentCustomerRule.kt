package chapter6.policy

interface ExcellentCustomerRule {
    fun ok(history: PurchaseHistory): Boolean
}