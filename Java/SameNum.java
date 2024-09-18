import java.util.HashMap;

public class SameNum {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character,Integer> wordMap = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(!wordMap.containsKey(ch)) {
                answer[i] = -1;
                wordMap.put(ch, i);
            }else {
                answer[i] = i - wordMap.get(ch);
                wordMap.put(ch, i);
            }
        }
        return answer;
    }
}
