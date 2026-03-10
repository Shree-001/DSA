class Solution {
    public int[][] merge(int[][] i) {
        Arrays.sort(i,(a,b)-> Integer.compare(a[0],b[0]));// phele sort karenge acc to arrays first element (n log n)

        if(i.length<=1) return i; 

        List<int[]> res= new ArrayList<>();// result store karne ke liye 
        for(int in[]:i)
        {
            if(res.isEmpty() || res.get(res.size()-1)[1]<in[0] )
            {
                res.add(in);// no overlapp
            }
            else
            {
                res.get(res.size()-1)[1]=Math.max(res.get(res.size()-1)[1],in[1]);
            }
        }

        return res.toArray(new int[res.size()][]);
    }
}