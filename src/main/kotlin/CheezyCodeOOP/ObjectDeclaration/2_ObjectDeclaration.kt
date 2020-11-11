package CheezyCodeOOP.ObjectDeclaration

fun main() {
    // 1.1
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementFBLikes()
    SharingWidget.display()

}

// :1
object SharingWidget{
    var twitterLikes = 0
    var fbLikes = 0

    fun incrementTwitterLikes() = twitterLikes++
    fun incrementFBLikes() = fbLikes++

    fun display() = println("Facebook - $fbLikes -- Twitter - $twitterLikes")
}