class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0, right = n*m-1;

        while(low<= right){
            int mid = low + (right-low)/2;
            int row = mid/n;
            int col = mid%n;
            int val = matrix[row][col];
            
            if(val == target){
                return true;
            } else if(val < target) {
                low = mid+1;
            }else{
                right = mid-1;
            }
        }
        return false;
        
    }
}
