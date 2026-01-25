class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
        List<Integer> ans= new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i+k-1<n;i++)
        {
         ans.add(nums[i+k-1]-nums[i]);
        }
       
        return Collections.min(ans);
    }
}