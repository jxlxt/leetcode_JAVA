class Solution:
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        p0, p2, i = 0, len(nums) - 1, 0
        while i <= p2:
            if nums[i] == 2:
                nums[i], nums[p2] = nums[p2], nums[i]
                p2 -= 1
            elif nums[i] == 0:
                nums[i], nums[p0] = nums[p0], nums[i]
                p0 += 1
                i += 1
            else:
                i += 1
                # the idea is set two pointer which point at the position of '0'
                # and '2', if meet the '1' just move forward
