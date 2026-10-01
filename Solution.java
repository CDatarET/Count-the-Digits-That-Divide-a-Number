class Solution {
    public int countDigits(int num) {
        int t = num;
        int ret = 0;
        while(t > 0){
            if(num % (t % 10) == 0){
                ret++;
            }

            t /= 10;
        }

        return ret;
    }
}
