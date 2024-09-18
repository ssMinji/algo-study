# -*- coding: utf-8 -*-
def binary_search(array, value):
    # 먼저 찾으려는 값이 있을 수 있는 하한선, 상한선을 정한다 
    lower_bound = 0
    upper_bound = len(array) - 1

    # 상한선과 하산선 사이의 가운데 값을 계속 확인하는 반복문을 돈다 
    while lower_bound <= upper_bound:
        # 상한선과 하한선의 중간지점을 찾는다
        midpoint = (lower_bound + upper_bound) // 2

        # 중간지점의 값을 확인한다
        midvalue = array[midpoint]

        if midvalue == value: #중간 지점의 값이 찾고있던 값이면, 검색을 종료 
            return midpoint
        elif midvalue > value:  # 그렇지않다면 , 상한선 혹은 하한선을 조정한다 
            upper_bound = midpoint - 1
        elif midvalue < value:
            lower_bound = midpoint + 1

    #상한선과 하한선이 같아질때까지 반복 완료 -> 찾고있는값이 배열에 없다 
    return lower_bound

array = [3,17,75,80,202]
value = 22
print(binary_search(array, value))
