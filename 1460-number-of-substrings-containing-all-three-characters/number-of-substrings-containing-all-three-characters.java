class Solution {
    public int numberOfSubstrings(String s) {
        int lastseen[] = {-1,-1,-1};
        int count =0;
        for(int i=0;i<s.length();i++){
            lastseen[s.charAt(i)-'a']=i;
            count = count + (1+Math.min(lastseen[2],Math.min(lastseen[0],lastseen[1])));
        }
        return count;
    }
}