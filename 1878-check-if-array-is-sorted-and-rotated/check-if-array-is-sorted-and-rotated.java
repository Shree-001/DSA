class Solution {
    public boolean check(int[] n) {
    int d=0;
    for(int i=0;i<n.length;i++)
    {
    if(n[i]>n[(i+1)%n.length])
    {
        d++;
    }
        if(d>1)
        {
            return false;
        }

        
    }
     return true ;
    }
}