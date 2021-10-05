class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        nums_dict = {}
        nums_size = len(nums)

        for i in range(0, nums_size) :
            dict_key = target - nums[i]

            if dict_key in nums_dict.keys() :
                return [nums_dict[dict_key], i]
            else :
                nums_dict[nums[i]] = i


        return []

