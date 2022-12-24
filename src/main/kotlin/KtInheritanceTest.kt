open class Parent() {

    open fun doSmth() {
        print("Parent Do")
    }
}

class Child : Parent() {

    init {
        doSmth()
    }

    override fun doSmth() {
        super.doSmth()
        print("Child Do")
    }
}

fun main() {
    val child = Child()
}