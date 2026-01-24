class Solution {
    public int candy(int[] r) {
        int n = r.length;

        
        int[] c = new int[n];
        Arrays.fill(c,1);
        boolean f=true;
        while(f)
        {
            f=false;
         for (int i = 0; i < n; i++) {

               
                if (i > 0 && r[i] > r[i - 1] && c[i] <= c[i - 1]) {
                    c[i] = c[i - 1] + 1;
                    f=true;
                   
                }

                
                if (i < n - 1 && r[i] > r[i + 1] && c[i] <= c[i + 1]) {
                    c[i] = c[i + 1] + 1;
                    f=true;
                    
                }
            }
        }
        

        int s = 0;
        for (int c1 : c) {
            s+= c1;
        }

        return s;
    }
}
