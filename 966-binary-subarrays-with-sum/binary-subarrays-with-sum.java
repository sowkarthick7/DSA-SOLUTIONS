class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
        HashMap<Integer,Integer> set = new HashMap<>();
        int sum=0;
        int count=0;
        for(int  i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==k){
                count++;
            }
            if(set.containsKey(sum-k)){
                count=count+set.get(sum-k);
            }
            set.put(sum,set.getOrDefault(sum,0)+1);
            

        }
        return count;
    }
}