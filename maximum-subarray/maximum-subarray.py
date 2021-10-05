class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        sub_sum = nums[0]
        max_sum = nums[0]
        arr = nums[1:]
        for num in arr:
            sub_sum = max(sub_sum + num, num)
            max_sum = max(sub_sum, max_sum)

        return max_sum