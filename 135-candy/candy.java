class Solution {
    public int candy(int[] r) {
        int n = r.length;

        // Step 1: Give every child 1 candy
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = 1;
        }

        boolean changed = true;

        // Step 2: Keep fixing until no changes
        while (changed) {
            changed = false;

            for (int i = 0; i < n; i++) {

               
                if (i > 0 && r[i] > r[i - 1] && c[i] <= c[i - 1]) {
                    c[i] = c[i - 1] + 1;
                    changed = true;
                }

                
                if (i < n - 1 && r[i] > r[i + 1] && c[i] <= c[i + 1]) {
                    c[i] = c[i + 1] + 1;
                    changed = true;
                }
            }
        }

        int sum = 0;
        for (int candy : c) {
            sum += candy;
        }

        return sum;
    }
}
