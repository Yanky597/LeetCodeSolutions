class Solution {
    fun reverse(x: Int): Int {
        //Integer. parseInt()
        // 1.get int
        // 2.convert int to a string
        // 3.reverse the string
        // 4.convert string back to an int
        // check if int goes out of range
        // if yes return 0
        // else return convert int
        /*
            EDGE cases:
                1. if there is only one number,
                   check if its in bounds, if yes return answer
                   else return 0
                2. if negative, have to keep negative sign "-" as the first letter
        */
        if(x <= 9 && x >= -9){return x}
        var convertIntToString : String = "" + x
        try{
              var changeStringBackToInt = if(convertIntToString[0] !='-') Integer.parseInt(convertIntToString.reversed()) else Integer.parseInt("-" + convertIntToString.substring(1, convertIntToString.length).reversed())
              
              if(checkIfIntInRange(changeStringBackToInt)){return changeStringBackToInt}

        }
        catch(e : Exception){
            return 0
        }
        
         return 0
    }
 
    fun checkIfIntInRange(num : Int) : Boolean{
            var two : Double = 2.0
            var exponent : Double = 31.0
            if(num < Math.pow(-two, exponent)  
               || num > Math.pow(two, exponent)-1){
                return false
            }
        return true
    }
}
