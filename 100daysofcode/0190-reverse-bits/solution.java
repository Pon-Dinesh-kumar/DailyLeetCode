public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {

        int ans = 0;

        for (int i = 0; i < 32; i++) {
            int ld = 1 & n;
            n = n>>1;
            ans = ans<<1;
            ans+=ld;
        }

        return ans;
    }
}

