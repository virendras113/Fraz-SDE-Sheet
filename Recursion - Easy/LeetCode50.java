// 50. Pow(x,n)

// Approach - Recursion

class Solution {
    public double myPow(double x, int n) {

        if(n == 0) return 1;

        long nDupli = n;

        if(0 > n){
            nDupli = -nDupli;
            x = 1/x;
        }

        if(nDupli % 2 == 0){
            return myPow(x * x, (int)(nDupli/2));
        }

        return x * myPow(x, (int)(nDupli-1));
        
    }
}
