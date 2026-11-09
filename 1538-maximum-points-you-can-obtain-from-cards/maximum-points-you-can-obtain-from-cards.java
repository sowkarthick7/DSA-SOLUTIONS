class Solution {
    public int maxScore(int[] c, int k) {
        int l=0;
        int r=0;
        for(int i=0;i<k;i++){
            l+=c[i];
        }
        int max=l;
        int x=1;
        for(int i=c.length-1;i>=c.length-k;i--){
            l=l-c[k-x];
            x++;
            r+=c[i];
            int sum=l+r;
            max=Math.max(max,sum);
        }
        return max;
    }
}