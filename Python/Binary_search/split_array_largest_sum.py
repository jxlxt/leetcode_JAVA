class Solution:
    def splitArray(self, nums, m):
        """
        :type nums: List[int]
        :type m: int
        :rtype: int
        """
        size, high = len(nums), sum(nums)
        low = high // m
        while low <= high:
            mid = (low + high) // 2
            n, cnt, calid = m, 0, True
            for x in range(size):
                if nums[x] > mid:
                    valid = False
                    break
                if cnt + nums[x] > mid:
                    n -= 1
                    cnt = 0
                cnt += nums[x]
                if n == 0:
                    valid = False
                    break
            if valid:
                high = mid - 1
            else:
                low = mid + 1
        return low
