package chapter8.attack.composition

import chapter8.attack.PhysicalAttack

class FighterPhysicalAttack(
    private val physicalAttack: PhysicalAttack
) {
    fun singleAttackDamage(): Int {
        return physicalAttack.singleAttackDamage() + 20
    }

    fun doubleAttackDamage(): Int {
        return physicalAttack.doubleAttackDamage() + 10
    }
}