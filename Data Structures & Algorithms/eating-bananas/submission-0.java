class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int l = 1;
        int hi = 0;
        
        for(int pile :piles){
            hi = Math.max(hi,pile);
        }
        int ans = h;
        while( l <= hi){
            int mid = l +(hi-l)/2;
            long hours = 0;

            for(int pile : piles){
                hours +=(pile+mid-1)/mid;
            }
            if(hours <=h){
                ans = mid;
                hi = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }
}
