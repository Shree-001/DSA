class Solution {
    public int totalHammingDistance(int[] nums) {
        int ans=0;
        for(int n=0;n<nums.length;n++)
        {
            for(int j=n+1;j<nums.length;j++)
            {
                ans+=Integer.bitCount(nums[n]^nums[j]);
            }
        }
        return ans;
    }
}