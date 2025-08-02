class Solution {
    public long minCost(int[] b1, int[] b2) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int min = Integer.MAX_VALUE;
        int n = b1.length;
        for(int i = 0;i<n;i++){
            map.put(b1[i],map.getOrDefault(b1[i],0)+1);
            min = Math.min(min,b1[i]);
        }
        for(int i = 0;i<n;i++){
            map.put(b2[i],map.getOrDefault(b2[i],0)-1);
            min = Math.min(min,b2[i]);
        }
        List<Integer> l = new ArrayList<Integer>();
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            int k = m.getKey();
            int v = m.getValue();
            if(v%2 != 0) return -1;
            v = Math.abs(v)/2;
            for(int i = 0;i<v;i++){
                l.add(k);
            }
        }

        l.sort((a,b)->a-b);
        n = l.size()/2;
        long ans = 0;
        for(int i = 0;i<n;i++){
            ans += Math.min(2*min,l.get(i));
        }
        return ans;
    }
}