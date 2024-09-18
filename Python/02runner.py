# https://school.programmers.co.kr/learn/courses/30/lessons/178871
players = ["mumu", "soe", "poe", "kai", "mine"]
callings = ["kai", "kai", "mine", "mine"]	


for i in range(len(callings)):
    player = callings[i]
    idx = players.index(player)
    players[idx-1], players[idx] = players[idx], players[idx-1]
    #print(players)

def solution(players, callings):
    for c in callings: #O(N)
        idx = players.index(c) # 
        players[idx-1], players[idx] = players[idx], players[idx-1]
    
    return players
    # O(N^2)

players = ["mumu", "soe", "poe", "kai", "mine"]
player_dict = {}
for i in range(len(players)):
    player_dict[players[i]] = i 
print(player_dict)

idx_dict = {}
for i in range(len(players)):
    idx_dict[i] = players[i]
print(idx_dict)

for c in callings:
    cur_player = c #현재 선수의 이름
    cur_idx = player_dict[c] #현재 선수의 등수

    # 앞의 선수의 정보 가져오기 
    front_idx = cur_idx - 1 #앞 선수의 등수
    front_player = idx_dict[front_idx] #앞 선수의 이름

    # 두 선수의 정보를 바꿔치기 
    player_dict[cur_player], player_dict[front_player] = front_idx, cur_idx # 등수 정보 바꿔치기
    idx_dict[cur_idx], idx_dict[front_idx] = front_player, cur_player # 선수명 정보 바꿔치기 

print(idx_dict)


    


