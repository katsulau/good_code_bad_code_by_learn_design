package chapter6.magic

fun main() {
    val member = Member(10)
    val magicMap = mapOf<MagicType, Magic>(
        MagicType.FIRE to Fire(member),
        MagicType.SHIDEN to Shiden(member),
        MagicType.HELLFIRE to HellFire(member)
    )

    val magic = magicMap.get(MagicType.HELLFIRE) ?: throw IllegalArgumentException("該当のMagicが存在しません")

    println("${magic.name()}の攻撃力は${magic.attackPower().getValue()}です")
    println("${magic.name()}の魔法力は${magic.costMagicPoint().getValue()}です")
    println("${magic.name()}のテクニカルポイントは${magic.costTechnicalPoint().getValue()}です")
}