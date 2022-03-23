class Solution {
    fun convert(s: String, numRows: Int): String {
        
        if(s.length == 1 || numRows == 1) return s
        
        
        var result : String = ""
        var myWordList: Array<String> = Array(numRows) { "" }
        var directionAcending : Boolean  = true
        
        var counter : Int = 0;
        
        for(i in 0..s.length-1){
            println(counter)
            myWordList[counter] += s[i].toString();
            
            if(counter % (numRows-1) == 0 && i != 0){
                directionAcending = if(directionAcending) false else true
            }
            
            if(directionAcending){
                counter++
            }
            else{
                counter--
            }
        }
        
        for(word in myWordList) result += word
        
        
        return result
        
    }
}
