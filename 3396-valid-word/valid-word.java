class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
         boolean Vowel=false;
            boolean cons=false;
        for(char c:word.toCharArray())
        {
            if (!Character.isLetterOrDigit(c)) {
            return false;
            }
           
            if(Character.isLetter(c))
            {
                if("aeiou".indexOf(Character.toLowerCase(c))>=0)
                {
                    Vowel =true;
                }
                else cons=true;
            }
        }
        return Vowel && cons;
        
    }
}