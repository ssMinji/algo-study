import java.util.HashMap;

public class Player {
    public String[] solution(String[] players, String[] callings) {
        int n = players.length;
        HashMap<String, Integer> playerMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            playerMap.put(players[i], i);
        }

        for (String calling : callings) {
            int idx = playerMap.get(calling);
            if (idx > 0) {
                String tmp = players[idx - 1];
                players[idx - 1] = players[idx];
                players[idx] = tmp;

                playerMap.put(players[idx - 1], idx - 1);
                playerMap.put(players[idx], idx);
            }
        }

        return players;
    }
}
