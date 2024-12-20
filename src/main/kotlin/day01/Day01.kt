package day01

import readInput
import println
import kotlin.math.abs

fun main() {

    fun count(list: List<Int>, value: Int): Int {
        var count = 0
        for (element in list) {
            if (element == value) {
                count++
            }
        }
        return count
    }

    fun part1(input: List<String>): Int {
        // Solution for part 1
        val firstInputList: MutableList<Int> = mutableListOf()
        val secondInputList: MutableList<Int> = mutableListOf()

        for (line in input) {
            val elements = line.split(' ')
            firstInputList.add(elements[0].toInt())
            secondInputList.add(elements[3].toInt())
        }

        firstInputList.sort()
        secondInputList.sort()

        var distance = 0
        for (element in firstInputList.withIndex()) {
            distance += abs(element.value - secondInputList[element.index])
        }

        return distance
    }

    fun part2(input: List<String>): Int {
        // Solution for part 2
        val firstInputList: MutableList<Int> = mutableListOf()
        val secondInputList: MutableList<Int> = mutableListOf()

        for (line in input) {
            val elements = line.split(' ')
            firstInputList.add(elements[0].toInt())
            secondInputList.add(elements[3].toInt())
        }

        var occurrences: Int
        var similarityScore: Int
        val similarityList: MutableList<Int> = mutableListOf()

        for (element in firstInputList) {
            occurrences = count(secondInputList, element)
            similarityScore = element * occurrences
            similarityList.add(similarityScore)
        }

        return similarityList.sum()
    }

    // Test if implementation meets criteria from the challenge description, like:
    val testInput = readInput("day01", "day01_test")
    val testAnswer1 = 11
    check(part1(testInput) == testAnswer1) { "answer to test1 is wrong" }

    val testAnswer2 = 31
    check(part2(testInput) == testAnswer2) { "answer to test2 is wrong" }

    val input = readInput("day01", "day01")
    part1(input).println()
    part2(input).println()
}