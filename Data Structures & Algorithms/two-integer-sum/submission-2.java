class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        for(int i= 0; i<n; i++){
           // int sum = 0;

            for(int j = i+1 ; j<n; j++){
             //   sum += nums[j];
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }

        }
        return new int[0];
        
    }
}
