def solution(bridge_length, weight, truck_weights):
    # 1. 마지막 트럭을 제외한 모든 트럭이 다리를 통과하는데 걸리는 시간 
    time = 0 
    # 2. 현재 다리의 트럭 무게 총합 
    total_weight = 0 
    # 3. 다리 -> 큐
    bridge = [0]*bridge_length

    while(len(truck_weights)>0):
        tmp = bridge.pop(0)
        total_weight -= tmp 
        # 현재 다리의 트럭 무게 총합 + 대기1번 트럭의 무게 > weight
        if total_weight + truck_weights[0] > weight:
            bridge.append(0)
        else:
            truck = truck_weights.pop(0)
            bridge.append(truck)
            total_weight += truck
        time += 1

    # 마지막 트럭이 올라간 상태에서 다리의 길이를 더해주면, 모든 트럭이 통과하는데 
    # 걸리는 시간 
    return time + bridge_length
