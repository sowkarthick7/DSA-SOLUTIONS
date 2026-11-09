class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return sol(nums,k)-sol(nums,k-1);
    }
    private int sol(int[] nums,int k){
        if(k<0){
            return 0;
        }
        int r=0,l=0,count=0,sum=0;
        while(r<nums.length){
            sum+=(nums[r]%2);
            while(sum>k){
                sum-=(nums[l]%2);
                l++;
            }
            count=count+(r-l+1);
            r++;
        }
        return count;

    }
}