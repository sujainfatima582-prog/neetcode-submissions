class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        Map<Integer,Integer> premap = new HashMap<>();
        
        for(int i= 0; i<n; i++){
            int num = nums[i];
            int diff = target - num;

            if(premap.containsKey(diff)){
                return new int[]{premap.get(diff),i};
            }
            premap.put(num,i);
        }
        return new int[]{};
    }
}
