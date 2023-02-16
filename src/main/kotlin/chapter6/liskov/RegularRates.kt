package chapter6.liskov

class RegularRates: HotelRates {
    override fun fee(): Money {
        return Money(5000)
    }

    override fun busySeasonFee(): Money {
        return fee().add(Money(3000))
    }
}