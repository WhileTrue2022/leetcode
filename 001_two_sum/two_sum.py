class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        hashMap = {}

        for i in range(len(nums)):
            wanted = target - nums[i]
            if wanted in hashMap:
                return [i, hashMap[wanted]]
            else:
                hashMap[nums[i]] = i
