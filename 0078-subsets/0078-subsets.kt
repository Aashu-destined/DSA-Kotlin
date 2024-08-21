class Solution {
    fun subsets(nums: IntArray) = arrayListOf(emptyList<Int>()).apply {
        nums.forEach { n -> addAll(map { it + n }) }
    }
}