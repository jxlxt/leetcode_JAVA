class Solution:
    def smallestDistancePair(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        # trial and error algorithm
        nums = sorted(nums)
        l, n = 0, len(nums)
        r = nums[n-1]-nums[0]

        while l < r:
            cnt = 0
            m = l + (r - l) // 2
            i = j = 0
            while i < n:
                while j < n and nums[j] <= nums[i] + m:
                    j += 1
                    cnt += j-i-1
                i += 1
            if cnt < k:
                l = m + 1
            else: 
                r = m
        return l
