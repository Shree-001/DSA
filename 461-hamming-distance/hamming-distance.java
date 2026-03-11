class Solution {
    public int hammingDistance(int x, int y) {
        int a=x^y;
        int c=0;
        while(a>0)
        {
            a=a&(a-1);
            c++;
        }
        return c;

        
    }
}

// xor karo and count no of 1