class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        while(n>0){
            int digit = n%10;
            map.put(digit,map.getOrDefault(digit,0)+1);
            n/=10;
        }
        int score = 0;
        for(int digit : map.keySet())
        {
            score+= digit*map.get(digit);
        }
        return score;
    }
}