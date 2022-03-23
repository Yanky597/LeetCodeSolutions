class Solution {
    public void rotate(int[][] matrix) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        Integer counter = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                map.put(counter, matrix[i][j]);
                counter++;
            }
        }
        
        counter = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
               matrix[j][(matrix.length-1) - i] = map.get(counter);
               counter++;
            }
        }
    }
}
