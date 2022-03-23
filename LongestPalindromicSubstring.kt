class Solution {
    fun longestPalindrome(s: String): String {
    
        if(s.length == 1) return s;
        
        var max : String = s[0].toString();
        var tmpSubString : String  = "";
    
        var firstHalf : String = s.substring(0, s.length/2)
        var secondHalf : String = s.substring(s.length/2, s.length)
        
        if(firstHalf == secondHalf){
            return firstHalf + secondHalf
        }
    
        
        for(i in 0..s.length-1){
            for(j in s.length-1 downTo i){
                
                 if(s[i] == s[j]){
                    if(isPalindrome(i, j, s)){
                        tmpSubString = s.substring(i,j+1)
                        max = if(tmpSubString.length > max.length) tmpSubString else max
                    }
                 }       
             }
        }   
        return max
    }
    
    fun isPalindrome(letter1 : Int, letter2: Int, word : String) : Boolean{
        
        if(letter1+1 == letter2 && word[letter1] == word[letter2]) return true
        if(letter1 == letter2 && word[letter1] == word[letter2]) return true
        
        if(word[letter1] == word[letter2]){
            return isPalindrome(letter1 + 1, letter2 - 1,word )
        }
        
        return false;
        
    }
}
