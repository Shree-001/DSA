class Solution {
    public int findComplement(int num) {

       int mask=(Integer.highestOneBit(num)<<1)-1;
        return mask ^ num;

        
    }
}

/* xor with mask 1 gives the complement of the no 
mask = all one in pos of binary 2->10 mask->11
but java stores binary in 32 bit form so we have to find length of bit of n
Integer,highestOneBit-> 5=101 so it will give 100(left most 1)
>>1 -> left shift one as later we have to sub 1 so we want one ome decimal place 
-1-> 100 - 1 = 011 
*/