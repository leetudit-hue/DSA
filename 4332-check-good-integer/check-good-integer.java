class Solution {
    int digit(int n){
        int sum = 0;
        while(n > 0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
    int square (int n){
        int sum = 0;
        while(n > 0){
            int d = n%10;
            sum += d*d;
            n/=10;
        }
        return sum;
    }
    public boolean checkGoodInteger(int n) {
        int digits = digit(n);
        int sqS = square(n);
        if(sqS - digits >= 50) return true;
        return false;
    }
}