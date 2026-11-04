class Solution {
    public int totalFruit(int[] fruits) {
        int max=0;
        int l=0;
        HashMap<Integer,Integer> basket = new HashMap<>();
        for(int r=0;r<fruits.length;r++){
            basket.put(fruits[r],basket.getOrDefault(fruits[r],0)+1);
            while(basket.size()>2){
                basket.put(fruits[l],basket.get(fruits[l])-1);
                if(basket.get(fruits[l])==0){
                    basket.remove(fruits[l]);
                }
                l++;
            }
            max=Math.max(max,r-l+1);


        }
        return max;
    }
}