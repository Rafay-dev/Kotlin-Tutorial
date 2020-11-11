package CheezyCodeOOP.Inheritance

// 'open' keyword is used to tell compiler that this class can
// be inherited by other class

open class Phone(){

    val name: String = ""
    val type: String = ""
    val volume: Int = 10

    fun makeCall() {}
    fun display() {}
    fun powerOff() {}
    fun getDeviceInfo() {}
}