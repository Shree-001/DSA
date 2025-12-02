class Solution {
    
        private static final int m = (int) 1e9 + 7;
        private static final int INV2 = 500_000_004;
        public int countTrapezoids(int[][] points) 
{
        Map<Integer,Integer> yc= new HashMap<>();
        for(int[]p:points)
        {
            yc.put(p[1],yc.getOrDefault(p[1],0)+1);
        }
        long ts=0;//uske phele vale ke line ke sums
        long sq=0;//* karne se acha hai ki sq karke /2 karo
        for(int cnt:yc.values())
        {
            if(cnt<2) continue;
            long seg=(long) cnt*(cnt-1)/2; 
            ts=(ts+seg)%m; // total no of combination ko add karna taki baad mai mul kar sake
            sq=(sq+seg%m*(seg%m))%m;

        }
        long tsm=ts%m;
        long ans=(tsm*tsm%m-sq+m)%m;
        ans=ans*INV2 %m;
        return(int)ans;
    }
}