class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        perfect_list = [i for i in range(1, len(nums)+1)]
        return sum(perfect_list) - sum(nums)
