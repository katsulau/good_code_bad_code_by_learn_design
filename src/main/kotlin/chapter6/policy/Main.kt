package chapter6.policy

fun main() {
    val goldCustomerPolicy = GoldCustomerPolicy.of()
    val silverCustomerPolicy = SilverCustomerPolicy.of()

    val goldAndSilverOkPurchaseHistory = PurchaseHistory(totalAmount = 200000, returnRate = 0f, purchaseFrequencyPerMonth = 50)

    println("シルバー会員ポリシーを満たしているか: ${silverCustomerPolicy.complyWithAll(goldAndSilverOkPurchaseHistory)}")
    println("ゴールド会員ポリシーを満たしているか: ${goldCustomerPolicy.complyWithAll(goldAndSilverOkPurchaseHistory)}")

    val silverOkPurchaseHistory = PurchaseHistory(totalAmount = 15000, returnRate = 0f, purchaseFrequencyPerMonth = 50)
    println("シルバー会員ポリシーを満たしているか: ${silverCustomerPolicy.complyWithAll(silverOkPurchaseHistory)}")
    println("ゴールド会員ポリシーを満たしているか: ${goldCustomerPolicy.complyWithAll(silverOkPurchaseHistory)}")
}