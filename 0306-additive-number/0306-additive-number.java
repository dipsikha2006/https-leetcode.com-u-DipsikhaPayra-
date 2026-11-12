
import java.math.BigInteger;

class Solution {
    public boolean isAdditiveNumber(String num) {

        int n = num.length();

        for (int i = 1; i <= n / 2; i++) {

            
            if (num.charAt(0) == '0' && i > 1)
                break;

            for (int j = 1; Math.max(i, j) <= n - i - j; j++) {

                
                if (num.charAt(i) == '0' && j > 1)
                    break;

                BigInteger a = new BigInteger(num.substring(0, i));
                BigInteger b = new BigInteger(num.substring(i, i + j));

                int k = i + j;

                while (k < n) {

                    BigInteger sum = a.add(b);
                    String s = sum.toString();

                    if (!num.startsWith(s, k))
                        break;

                    k += s.length();

                    a = b;
                    b = sum;
                }

                if (k == n)
                    return true;
            }
        }

        return false;
    }
}
