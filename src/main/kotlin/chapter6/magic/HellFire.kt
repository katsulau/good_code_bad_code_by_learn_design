package chapter6.magic

class HellFire(
    private val member: Member
): Magic {
    override fun name(): String {
        return "地獄の業火"
    }

    override fun costMagicPoint(): MagicPoint {
        return MagicPoint(100)
    }

    override fun attackPower(): AttackPower {
        return AttackPower(200 + member.getLevel())
    }

    override fun costTechnicalPoint(): TechnicalPoint {
        return TechnicalPoint(40)
    }
}