class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        if (t == null || t.size() == 0) {
            return 0;
        }

        for (int i = t.size() - 2; i >= 0; i--) {
            List<Integer> c = t.get(i);
            List<Integer> n = t.get(i + 1);

            for (int j = 0; j < c.size(); j++) {
                int minP = c.get(j) + Math.min(n.get(j), n.get(j + 1));
                c.set(j, minP);
            }
        }
        return t.get(0).get(0);
    }
}