class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        Map<Integer, Integer> ele = new HashMap<>();

        for(int i  = 0; i<n; i++){
           ele.put(nums[i],i);
        }
        for(int i = 0; i<n;i++){
            int diff = target- nums[i];
            if(ele.containsKey(diff) && ele.get(diff) != i){
                return new int[]{i,ele.get(diff)};
            }
        }
        return new int[0];    
    }
}
