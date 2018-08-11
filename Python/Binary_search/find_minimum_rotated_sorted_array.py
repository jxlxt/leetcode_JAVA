class Solution:
    def findMin(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if nums in None or len(nums) == 0:
            return -1
        
        # this is binary search template II
        left, right = 0, len(nums) - 1
        while left < right:
            mid = left + (right - left) // 2
            if nums[mid] > nums[right]:
                left = mid + 1
            else:
                right = mid

        if nums[left] < nums[right]:
            return nums[left]
        else:
            return nums[right]
