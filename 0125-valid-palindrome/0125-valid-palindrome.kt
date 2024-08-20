class Solution {
    var i = 0
    fun isPalindrome(s: String): Boolean {
        val snew = s.filter { it.isLetterOrDigit() }.lowercase()
        if(i >=snew.length/2) return true
        if(snew[i]!=snew[snew.length-i-1]) return false
        i++
        return isPalindrome(snew)
    }

}