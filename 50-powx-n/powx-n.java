class Solution {
    public double myPow(double x, int n) {

        double ans = 1.0;

        long nn = n;

        // If power is negative
        if (nn < 0) {
            nn = -1 * nn;
        }

        while (nn > 0) {

            // If power is odd
            if (nn % 2 == 1) {
                ans = ans * x;
                nn = nn - 1;
            }

            // If power is even
            else {
                x = x * x;
                nn = nn / 2;
            }
        }

        // If original n was negative
        if (n < 0) {
            ans = 1.0 / ans;
        }

        return ans;
    }
}