fun main() {
    val iterator = ('a'..'e')

    for ((index, value) in iterator.withIndex()) {
        println("The element at $index is $value")
    }
}