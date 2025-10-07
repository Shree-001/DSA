class Solution {
    public int[] avoidFlood(int[] r)
     {
        int len=r.length;
        int ans[]=new int[len];//answer store karega
        Map<Integer,Integer> fullL=new HashMap<>();// lake no and value-index of last day
        TreeSet<Integer> DryD=new TreeSet<>();// to store index of drydays
        for(int i=0;i<len;i++)
        {
            if(r[i]==0)//dry day
            {
                DryD.add(i);
            }
            else//rainy day
            {
                ans[i]=-1;//rainy day
                if(fullL.containsKey(r[i]))//already full hai ismai aur dal rahe hai(flood)
                {
                int lastRainDay = fullL.get(r[i]); //last time kab rain hua tha iss lake mai voh find karo kuyki drydays uske pass vala nikal na hai
              Integer nextAvailableDryDay = DryD.ceiling(lastRainDay);
              if (nextAvailableDryDay == null) // no ava dry day
                   {
                     return new int[0]; // return empty array
                    }
                    //dry day found
                     ans[nextAvailableDryDay] = r[i]; // array mai dalo ki dry day mai konse pani jaa raha hai
                    DryD.remove(nextAvailableDryDay);


            }
            fullL.put(r[i], i);
        }



        
    }
        for (int day : DryD) {
            ans[day] = 1; // Dry a default lake (e.g., lake 1).
        }
        
        return ans;
    }
}