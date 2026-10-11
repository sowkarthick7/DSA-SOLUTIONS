class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] pr = new int[n];
        pr[0]=1;
        for(int i=1;i<n;i++){
            pr[i]=pr[i-1]*nums[i-1];
        }
        int sf = 1;
        for(int i=n-1;i>=0;i--){
            pr[i]=pr[i]*sf;
            sf=nums[i]*sf;
        }
        return pr;
    }
}