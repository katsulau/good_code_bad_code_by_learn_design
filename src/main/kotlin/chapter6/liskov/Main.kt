package chapter6.liskov

fun main() {


    val hotelRates: HotelRates = RegularRates()
    val busySeasonFee: Money
    // もし、interfaceにbusySeasonFeeを定義しない場合、利用する側でインスタンスの型チェックを行い条件分岐を記述する形となってしまう。
    if (hotelRates is RegularRates) {
        busySeasonFee = hotelRates.fee().add(Money(3000))
    } else if (hotelRates is PremiumRates) {
        busySeasonFee = hotelRates.fee().add(Money(5000))
    }


    // busySeasonFeeを定義していれば良い
    val regularRates: HotelRates = RegularRates()
    val premiumRates: HotelRates = PremiumRates()
    println(regularRates.busySeasonFee())
    println(premiumRates.busySeasonFee())
}