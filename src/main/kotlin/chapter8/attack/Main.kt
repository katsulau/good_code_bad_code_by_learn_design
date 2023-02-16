package chapter8.attack

import chapter8.attack.inheritance.FighterPhysicalAttack

fun main() {
    val physicalAttack = PhysicalAttack()
    val fighterPhysicalAttack = FighterPhysicalAttack()
    // 継承を使っている場合、PhysicalAttackクラスの変更が、FighterPhysicalAttackクラスの
    // 想定していない挙動になることがある
    println(physicalAttack.doubleAttackDamage())
    // 10増加していて欲しいが、そうはならない
    println(fighterPhysicalAttack.doubleAttackDamage())

    // 委譲を利用した形
    val fighterPhysicalAttackWithComposition =
        chapter8.attack.composition.FighterPhysicalAttack(physicalAttack)
    // 10増加する
    println(fighterPhysicalAttackWithComposition.doubleAttackDamage())

}