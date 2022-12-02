fun main() {
    fun day01(input: List<String>): List<Int> {
        val highers = mutableListOf<Int>()
        var higher = 0
        var temp = 0
        for (i in input) {
            if (i.isNotBlank()) {
                temp += i.toInt()
            } else {
                if (temp > higher) {
                    higher = temp
                    highers.add(higher)
                } else {
                    higher = 0
                }

                temp = 0
            }
        }

        return highers
    }

    fun part1(input: List<String>): Int {
        val result = day01(input)
        return result.max()
    }

    fun part2(input: List<String>): Int {
        val result = day01(input)
        return result
            .sortedDescending()
            .take(3) // top three
            .sum()
    }

    val input = readInput("day01")
    println(part1(input))
    println(part2(input))
}
