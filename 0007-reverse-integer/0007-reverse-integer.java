class Solution {
    public int reverse(int x) {
        int INT_MAX = Integer.MAX_VALUE;
        int INT_MIN = Integer.MIN_VALUE;

        int sign = (x >= 0) ? 1 : -1;
        x = Math.abs(x);
        int reversedX = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            
            if (reversedX > (INT_MAX - digit) / 10) {
                return 0;
            }

            reversedX = reversedX * 10 + digit;
        }

        return sign * reversedX;
    }
    }