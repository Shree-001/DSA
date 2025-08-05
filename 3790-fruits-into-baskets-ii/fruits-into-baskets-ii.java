class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) 
    {
        int unplaced=0;
        boolean[] a=new boolean[baskets.length];
        for(int f:fruits)
        { 
            boolean isPlaced=false;
        for (int j = 0; j < baskets.length; j++)
         {
        if(f<=baskets[j] && !a[j] )
        
        {
            a[j]=true;
            isPlaced=true;
            break;
        }
        }

        if(!isPlaced) unplaced++;
        }
        return unplaced;
        }
    }

    
