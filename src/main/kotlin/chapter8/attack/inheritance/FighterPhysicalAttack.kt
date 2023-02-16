package chapter8.attack.inheritance

import chapter8.attack.PhysicalAttack

class FighterPhysicalAttack: PhysicalAttack() {
    override fun singleAttackDamage():Int {
        return super.singleAttackDamage() + 20
    }

    override fun doubleAttackDamage(): Int {
        return super.doubleAttackDamage() + 10
    }
}