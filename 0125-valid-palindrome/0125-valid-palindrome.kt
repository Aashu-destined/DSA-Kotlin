class Solution {
    fun isPalindrome(s: String): Boolean {
        val stringWithOnlyDigits = s.filter { it.isLetterOrDigit() }.lowercase()
        return palindrome(stringWithOnlyDigits,0,stringWithOnlyDigits.length-1)
    }
    fun palindrome(s : String,l:Int,r:Int):Boolean{
        if(l>r){
            return true
        }
        if(s[l]!=s[r])
        {
            return false
        }
        return palindrome(s,l+1,r-1)
        
    }

}