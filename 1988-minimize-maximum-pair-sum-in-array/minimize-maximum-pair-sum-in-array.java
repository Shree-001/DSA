class Solution {
    public int minPairSum(int[] n1) {
        Arrays.sort(n1);
        int n=n1.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
ans=Math.max(ans,n1[i]+n1[n-1-i]);
        }
        return ans;

        
    }
}