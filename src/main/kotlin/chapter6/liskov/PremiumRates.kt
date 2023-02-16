package chapter6.liskov

class PremiumRates: HotelRates {
    override fun fee(): Money {
        return Money(10000)
    }

    override fun busySeasonFee(): Money {
        return fee().add(Money(5000))
    }
}