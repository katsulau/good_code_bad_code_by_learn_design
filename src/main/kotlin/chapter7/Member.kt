package chapter7

class Member(
    private val id: String
) {
    fun getId():String {
        return id
    }

    fun isAlive(): Boolean {
        return true
    }
}