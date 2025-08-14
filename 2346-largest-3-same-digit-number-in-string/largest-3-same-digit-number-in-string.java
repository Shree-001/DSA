import java.util.regex.*;

class Solution {
    public String largestGoodInteger(String num) {
        Pattern pattern = Pattern.compile("(\\d)\\1\\1");
        Matcher matcher = pattern.matcher(num);

        String max = "";
        while (matcher.find()) {
            String match = matcher.group();
            if (max.isEmpty() || match.compareTo(max) > 0) {
                max = match;
            }
        }
        return max;
    }
}
