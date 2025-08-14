import java.util.regex.*;
class Solution {
    public String largestGoodInteger(String num) {
        
        Pattern p =Pattern.compile("(\\d)\\1\\1");
        Matcher m=p.matcher(num);
        String max="";
        while(m.find()){// scans the string in O(n)
        String match=m.group();/// stroes the substring that matches "777"
        if(max.isEmpty() || match.compareTo(max)>0)
        {
            max=match;
        }
        }
        return max;


    }
}