package chapter6.magic

class Shiden(
    private val member: Member
): Magic {
    override fun name(): String {
        return "紫電"
    }

    override fun costMagicPoint(): MagicPoint {
        val magicPoint = member.getLevel() + 10
        return MagicPoint(magicPoint)
    }

    override fun attackPower(): AttackPower {
        return AttackPower(30)
    }

    override fun costTechnicalPoint(): TechnicalPoint {
        return TechnicalPoint(15)
    }
}