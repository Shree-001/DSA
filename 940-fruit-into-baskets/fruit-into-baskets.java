class Solution {
    public int totalFruit(int[] fruits) {
        int n =fruits.length;
        Map<Integer,Integer> map = new HashMap<>();
        int f=0,l=0,maxLen=0;// two pointer for slide window 
        while(l<n)
        {
            map.put(fruits[l],map.getOrDefault(fruits[l],0)+1);// fruit at end pos ko map mai dalo and inc count(isliye +1)
            while(map.size()>=3)// basket mai 2 se zada type nahi hone chaiye
            {
               map.put(fruits[f],map.get(fruits[f])-1);
                if(map.get(fruits[f]) == 0) map.remove(fruits[f]);
                f++;
            }
            int currLen = l-f+1;
            maxLen = Math.max(maxLen,currLen);
            l++;
        }
        return maxLen;
    }
}