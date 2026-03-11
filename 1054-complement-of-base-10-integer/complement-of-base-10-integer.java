class Solution {
    public int bitwiseComplement(int n) {
       String s=Integer.toBinaryString(n);
       StringBuilder s1=new StringBuilder();
       for(char c:s.toCharArray())
       {
        if(c=='0') s1.append('1');
        else s1.append('0');
       }
         int res=Integer.parseInt(s1.toString(),2);
         return res;

    }
}