class Solution {
    public int reverseBits(int n) {
        
        if (n == 0) {
            return 0;
        }
        int result = 0;

        for (int i=1; i<=32; i++) {
            
            result <<= 1;
            result = result | (n & 1);  // first get lsb
            
            // n >>= 1;     // if n is positive and  unsigned because it will preserve signed bit
            n >>>= 1;   // if n is negative and signed so it will not preserve signed bit 

            // but in java int is always signed whether it is positive or negative int number
        }

        return result;
    }
}