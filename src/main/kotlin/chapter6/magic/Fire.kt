package chapter6.magic

class Fire(
    private val member: Member
):Magic {
    override fun name(): String {
        return "ファイア"
    }

    override fun costMagicPoint(): MagicPoint {
        val magicPoint: Int = 2 + member.getLevel() / 2
        return MagicPoint(magicPoint)
    }

    override fun attackPower(): AttackPower {

        return AttackPower(5)
    }

    override fun costTechnicalPoint(): TechnicalPoint {
        return TechnicalPoint(0)
    }
}