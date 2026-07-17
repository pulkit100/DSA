class Solution {
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
    return a;
    }

    public int gcdOfOddEvenSums(int n) {
        return gcd(n*n, n*(n+1));   // first n odd num sum -- n^2
        // first n even number sum -- n*(n+1)
    }
}