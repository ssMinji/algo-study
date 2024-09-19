# https://school.programmers.co.kr/learn/courses/30/lessons/178871
players = ["mumu", "soe", "poe", "kai", "mine"]
callings = ["kai", "kai", "mine", "mine"]	


for i in range(len(callings)):
    player = callings[i]
    idx = players.index(player)
    players[idx-1], players[idx] = players[idx], players[idx-1]
    #print(players)

def solution2(players, callings):
    for c in callings: #O(N)
        idx = players.index(c) # 
        players[idx-1], players[idx] = players[idx], players[idx-1]
    
    return players
    # O(N^2)

players = ["mumu", "soe", "poe", "kai", "mine"]
callings = ["kai", "kai", "mine", "mine"]	

def solution(players, callings):
    player_dict = {}
    for i in range(len(players)):
        player_dict[players[i]] = i # 선수 이름을 key, 등수를 value로 하는 딕셔너리 생성  

    for c in callings:
        idx = player_dict[c] #호명당한 선수의 등수

        # 앞의 선수의 이름 알아내기
        front_player = players[idx-1]
        # 앞선수와 호명당한 선수 바꿔치기 
        players[idx-1], players[idx] = players[idx], players[idx-1]

        # 등수 업데이트 
        player_dict[c] = idx-1
        player_dict[front_player] = idx
    return players



    


