package chapter7

class Party(
    private val members: List<Member> = listOf()
) {
    companion object {
        const val MAX_MEMBER_COUNT = 4
    }
    fun add(member: Member): Party {
        if (exists(member)) {
            throw IllegalArgumentException("すでにパーティにメンバーが加わっています。 memberId: ${member.getId()}")
        }

        if (isFull()) {
            throw IllegalStateException("メンバーの最大人数に達しています")
        }

        return Party(members.plus(member))
    }

    fun exists(member: Member): Boolean {
        return members.any{it.getId() == member.getId()}
    }

    fun isFull(): Boolean {
        return members.size == MAX_MEMBER_COUNT
    }

    fun isAlive(): Boolean {
        return members.any{it.isAlive()}
    }
}