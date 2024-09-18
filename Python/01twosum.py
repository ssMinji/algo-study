# -*- coding: utf-8 -*-

nums = [2,7,11,15]
target = 9

def twoSum(nums, target):
    for i in range(len(nums)-1):
        for j in range(i+1, len(nums)):
            if nums[i] + nums[j] == target:
                return [i, j]

# 최악의 경우 nums 리스트를 다 훑어야 하므로 O(n^2) 
# 공간복잡도
# 다른 배열에 복사하는 과정은 없고, i와 j 지역변수만을 사용하므로 O(1)의 복잡도 

# 개선 
def twoSum(nums, target):
    for i, num in enumerate(nums):
        res = target - num 
        if res in nums[i+1::]: # list 의 검색 시간복잡도 : O(N) : 리스트를 하나하나 순회하기때문
            return [i, i+nums[i+1::].index(res)+1] # O(1)

# 개선 
def twoSum3(nums, target):
    dicts = {} 
    for i, num in enumerate(nums):
        res = target - num 
        if res in dicts: # dicts 의 검색 시간 복잡도: O(1)
            return [i, dicts[res]]

        dicts[num] = i 

# 시간복잡도: O(N)
# 공간복잡도: O(N) : dicts 객체 만들기 때문

print(twoSum3(nums, target))