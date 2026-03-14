class Solution {

    int count = 0;
    String res = "";

    public String getHappyString(int n, int k) {
        dfs("", n, k);
        return res;
    }

    void dfs(String s, int n, int k) {

        if (s.length() == n) {
            if (++count == k) res = s;
            return;
        }

        for (char c : "abc".toCharArray())
            if (s.isEmpty() || s.charAt(s.length()-1) != c) {
                dfs(s + c, n, k);
                if (!res.isEmpty()) return;
            }
    }
}