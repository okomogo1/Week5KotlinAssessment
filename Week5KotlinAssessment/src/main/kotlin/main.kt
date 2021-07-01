fun main(args: Array<String>) {
    println(removeVowels("Delta State Innovation Hub"))

}
fun removeVowels(s: String): String {
    val str = StringBuilder()
    for (i in s) {
        if (i != 'A' && i != 'a'
            && i != 'E' && i != 'e'
            && i != 'I' && i != 'i'
            && i != 'O' && i != 'o'
            && i != 'U' && i != 'u') {
            str.append(i)
        }
    }
    return str.toString()
}

