from collections import deque

def solution(bridge_length, weight, truck_weights):
    time = 0
    total_weight = 0 
    bridge = deque(0 for _ in range(bridge_length))
    truck_weights.reverse()

    while(truck_weights):
        tmp = bridge.popleft()
        total_weight -= tmp 
        if total_weight + truck_weights[-1] > weight:
            bridge.append(0)
        else:
            truck = truck_weights.pop()
            bridge.append(truck)
            total_weight += truck
        time += 1 
    
    return time + bridge_length