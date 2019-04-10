class Solution:
    def fractionToDecimal(self, numerator: int, denominator: int) -> str:
        if numerator == 0: return '0'
        d = {}
        ans = "-" if ((numerator > 0) ^ (denominator > 0)) else ''
        numerator, denominator = abs(numerator), abs(denominator)
        div, mod = divmod(numerator, denominator)
        # mod is zero, which means 整除
        if mod == 0:
            return ans + str(div)
        ans += str(div) + '.'
        d[mod] = len(ans)
        while mod:
            mod *= 10
            div, mod = divmod(mod, denominator)
            ans += str(div)
            if mod in d:
                index = d[mod]
                ans = ans[:index] + "(" + ans[index:] + ")"
                break
            else:
                d[mod] = len(ans)
        return ans
