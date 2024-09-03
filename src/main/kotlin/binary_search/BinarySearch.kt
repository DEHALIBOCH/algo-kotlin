package binary_search

fun binarySearch(intArray: IntArray, targetItem: Int): Int? {

    var startIndex = 0
    var endIndex = intArray.lastIndex

    while (startIndex <= endIndex) {
        val middleIndex = (startIndex + endIndex) / 2
        val guessItem = intArray[middleIndex]

        if (guessItem == targetItem) {
            return middleIndex
        } else if (targetItem < guessItem) {
            endIndex = middleIndex - 1
        } else {
            startIndex = middleIndex + 1
        }
    }

    return null
}


fun main() {
    val sampleArray = intArrayOf(1, 3, 5, 7, 40)
    val targetItem = 5
    val result = binarySearch(sampleArray, targetItem)
    println(result ?: "undefined")
}