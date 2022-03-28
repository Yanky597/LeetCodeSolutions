class Solution {
    fun brokenCalc(startValue: Int, target: Int): Int {
        
        if(startValue == target) return 0
        if(startValue == target+1) return 1
        if(startValue == target/2) return 1
        
        var currentTarget = target
        var counter = 0
        
        while(currentTarget > startValue){
            if(currentTarget % 2 != 0){
                currentTarget++
                counter++
            }
            currentTarget /= 2
            counter++
        }
        
        
        if(startValue != currentTarget){
            counter += startValue - currentTarget    
        }
        
        return counter
      
    }

}
