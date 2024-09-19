import java.util.Arrays;
import java.util.HashMap;
// https://school.programmers.co.kr/learn/courses/30/lessons/178871
public class Player {
    public String[] solution2(String[] players, String[] callings) {
        for (String calling: callings){
            int idx = Arrays.asList(players).indexOf(calling); // Arrays.asList -> 배열순회하며 리스트생성: O(N)+ 검색 ->O(N) = O(N)
            String tmp = players[idx - 1]; // 앞의 선수 이름
            players[idx - 1] = players[idx]; // 앞선수와 바꿔치기
            players[idx] = tmp;
        }
        return players;
    }
    public String[] solution(String[] players, String[] callings) {
        int n = players.length;
        HashMap<String, Integer> playerMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            playerMap.put(players[i], i);
        }

        for (String calling : callings) {
            int idx = playerMap.get(calling); // 현재 선수(c)의 등수
            if (idx > 0) {
                String tmp = players[idx - 1]; // 앞의 선수 이름
                players[idx - 1] = players[idx]; // 앞선수와 바꿔치기
                players[idx] = tmp;

                // 등수 정보 바꿔치기 -> put 함수는 지정한 키가 이미 존재하면 새로운 값으로 바꿔치기 됨
                playerMap.put(players[idx - 1], idx - 1);
                playerMap.put(players[idx], idx);
            }
        }

        return players;
    }
}
