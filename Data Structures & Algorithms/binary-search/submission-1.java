class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        return binsearch(0,n-1,nums,target);
        
    }
    public int binsearch(int l, int r,int[] nums, int target){
        if(l>r) return -1;
        
        int mid = l+(r-l)/2;
        if(nums[mid] == target){
            return mid;
        }
        else
        return(nums[mid] < target) ? binsearch(mid+1,r,nums,target) : binsearch(l,mid-1,nums,target);
    }
}
