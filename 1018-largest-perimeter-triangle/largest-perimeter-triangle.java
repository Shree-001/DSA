class Solution {
    public int largestPerimeter(int[] nums) {
       Arrays.sort(nums);//
       int n =nums.length;
       for (int i = n - 1; i >= 2; i--) 
       {
        int a=i-1;
       int b=i-2;
        if(nums[a]+nums[b]>nums[i])
        {
            return nums[a]+nums[b]+nums[i];
        }
        
    }
    return 0;
}
}