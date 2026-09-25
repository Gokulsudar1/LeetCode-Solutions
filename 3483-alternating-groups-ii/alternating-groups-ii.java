class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int count = 0;
        int alternating = 1;
        for (int i = 1; i < n + k - 1; i++) {
            if (colors[i % n] != colors[(i - 1) % n]) {
                alternating++;
            } else {
                alternating = 1;
            }
            if (alternating >= k)  count++; 
        }
        return count;
    }
}