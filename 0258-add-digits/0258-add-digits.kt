class Solution {
    fun addDigits(num: Int): Int {
    var number = num
    var result = 0
    while (number > 0){
        while (number>0){
        result +=number%10
        number /=10}
        if (result>9){
            number=result
            result = 0
        }else {
            return result
        }
    }
    return result
    }
}