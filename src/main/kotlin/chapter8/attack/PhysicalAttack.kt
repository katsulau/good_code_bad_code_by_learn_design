package chapter8.attack

open class PhysicalAttack {

    open fun singleAttackDamage():Int {
        return 20
    }

    open fun doubleAttackDamage():Int {
        return singleAttackDamage() + singleAttackDamage()
//        return 40
    }
}