import java.util.HashMap;

public class SameNum {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character,Integer> wordMap = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(!wordMap.containsKey(ch)) { // 처음 나온 문자일 시
                answer[i] = -1; // 정답 배열에 -1
                wordMap.put(ch, i); // 해시맵에 해당 단어의 인덱스를 저장
            }else { // 만약 나온적이 있는 문자일 시
                answer[i] = i - wordMap.get(ch); //거리 계산 -> 해당 문자의 인덱스와 나온적 있는 문자의 인덱스의 차이를 구한 뒤,그 값을 넣는다
                wordMap.put(ch, i); //해당 문자의 위치를 갱신한다(가장 마지막으로 등장한 위치를 저장하는 의미가 됨)
            }
        }
        return answer;
    }
}
