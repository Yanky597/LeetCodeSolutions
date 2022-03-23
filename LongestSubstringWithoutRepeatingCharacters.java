class Solution {
    public int lengthOfLongestSubstring(String s) {
        // need to keep track of the longest substring.
        // BRUTE FORCE:create a max variable, iterate through the string, add elements to a set
        // if the set contains the current variable, check if the current set size
        // is greater than max, if yes update max, else create a new set. 
        int max = 0;
        HashSet<String> letterSet = new HashSet<>();
        String [] myStringArray = s.split(""); 
        if(myStringArray.length == 1 && myStringArray[0].equals("")){
            return 0;
        }
        
        for(int i = 0; i < myStringArray.length; i++){
            for(int j = i; j < myStringArray.length; j++){
                if(letterSet.contains(myStringArray[j])){
                    max = letterSet.size() > max? letterSet.size() : max;
                    letterSet = new HashSet<>();
                    break;
                }
                else{
                    letterSet.add(myStringArray[j]);
                }
                if(max == myStringArray.length-i){
                    break;
                }
            }
        }
        
        
         max = letterSet.size() > max? letterSet.size() : max;
            
        return max;
    }
}
