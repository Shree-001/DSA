class Solution {
    public boolean isPowerOfThree(int n) {
        double max=Math.pow(3,19);
        return n>0 && max%n==0; 
        
    }
}