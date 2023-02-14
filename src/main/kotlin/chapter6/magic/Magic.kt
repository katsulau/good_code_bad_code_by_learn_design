package chapter6.magic

interface Magic {
    fun name(): String
    fun costMagicPoint(): MagicPoint
    fun attackPower(): AttackPower
    fun costTechnicalPoint(): TechnicalPoint
}