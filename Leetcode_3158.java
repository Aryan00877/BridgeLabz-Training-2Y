class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] freq = new int[51];
        int ans = 0;

        for (int n : nums) {
            freq[n]++;
            if (freq[n] == 2)
                ans ^= n;
        }

        return ans;
    }
}