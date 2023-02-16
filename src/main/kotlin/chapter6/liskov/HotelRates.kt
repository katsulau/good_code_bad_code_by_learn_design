package chapter6.liskov

interface HotelRates {

    fun fee(): Money

    fun busySeasonFee(): Money
}