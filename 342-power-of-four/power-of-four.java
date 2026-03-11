class Solution {
    public boolean isPowerOfFour(int n) {
        return ((n & (n-1))==0 && n%3==1);
        
    }
}

/*power of 4-> is also a power of 2*/
