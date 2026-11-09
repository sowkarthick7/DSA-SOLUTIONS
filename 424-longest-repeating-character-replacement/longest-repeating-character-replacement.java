class Solution {
    public int characterReplacement(String s, int k) {
        int max=0;
        int maxfreq = 0;
        int[] freq = new int[26];
        int l=0;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
            maxfreq=Math.max(maxfreq,freq[s.charAt(i)-'A']);
            if((i-l+1-maxfreq)>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}