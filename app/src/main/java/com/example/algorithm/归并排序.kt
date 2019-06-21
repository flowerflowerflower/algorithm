package com.example.algorithm


fun MergeSort(a: Array<Int>): Array<Int> {

    if (a.size < 2) return a
    val mid = a.size / 2
    val left = a.copyOfRange(0, mid - 1)
    val right = a.copyOfRange(mid, a.size - 1)

    return merge(MergeSort(left), MergeSort(right))

}


fun merge(left: Array<Int>, rights: Array<Int>): Array<Int> {

    val result = Array<Int>(left.size + rights.size) {
        it
    }
    var index = 0
    var i = 0
    var j = 0

    while (index < result.size) {

        if (i >= left.size) {
            result[index] = rights[j++]
        } else if (j >= rights.size) {
            result[index] = left[i++]
        } else if (left[i] > rights[j]) {
            result[index] = rights[j++]
        } else {
            result[index] = left[i++]
        }
        index = index + 1

    }
    return result
}


fun main() {

    val result = arrayOf(5, 9, 8, 6, 2, 10, 1)
    val end = MergeSort(result)

}
