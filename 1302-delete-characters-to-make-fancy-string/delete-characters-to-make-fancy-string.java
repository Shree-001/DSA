class Solution {
    public String makeFancyString(String s) {
        StringBuilder str = new StringBuilder();
        for(char c:s.toCharArray())
        { int len=str.length();
            if(len>=2 && str.charAt(len-1)==c && str.charAt(len-2)==c )
            {
            continue;
        }
        str.append(c);
        }
        return str.toString();
    }
}