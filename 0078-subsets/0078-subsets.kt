class Solution {
    val finalArr : MutableList<List<Int>> = mutableListOf()
    fun subsets(nums: IntArray): List<List<Int>> {
        // send an empty array 
        returnSubset(0,nums,mutableListOf())
        return finalArr
    }

    fun returnSubset(i:Int,nums: IntArray,arr : MutableList<Int>){

        if(i>=nums.size){
        // save on base case
        finalArr.add(ArrayList(arr))
        return
        }
        // add items to the array 
        arr.add(nums[i])
        returnSubset(i+1,nums,arr)
        // return and remove from the array
        arr.remove(nums[i])
        returnSubset(i+1,nums,arr)
    }
}