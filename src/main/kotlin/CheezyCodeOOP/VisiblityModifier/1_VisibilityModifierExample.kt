package CheezyCodeOOP.VisiblityModifier

open class Base(){
    var a = 1 // public by default
    private var b = 2 // private to Base class
    protected open val c = 3 // Visible to the Base and it's derived classes
    internal val d = 4 // Visible inside the same module

    protected fun e(){} // Visible to the Base and the Derived class
}

class Derived : Base(){
    // a, c, d, e() of the Base class are visible
    // b is not visible
    override val c = 9 // c is protected
}

fun main(args: Array<String>){
    val base = Base()
    // base.a and base.d are visible
    // base.b, base.c and base.e() are not visible

    val derived = Derived()
    // derived.c is not visible
}