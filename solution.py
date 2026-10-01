class Solution:
    def countDigits(self, num: int) -> int:
        t = num
        ret = 0
        while t > 0:
            if num % (t % 10) == 0: 
                ret += 1

            t //= 10

        return ret
