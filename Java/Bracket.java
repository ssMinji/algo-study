import java.util.Stack;

public class Bracket {
    boolean solution2(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (s.charAt(i) == ')') { // ")" 닫힘괄호가 나올 때
                if (stack.isEmpty()) { //stack이 비어있는 상황(열리지 않았는데 닫힘 or 다 짝지어졌는데 닫힘이 또 들어옴)
                    return false;
                }
                stack.pop(); //리스트의 맨 끝 데이터를 제거 O(1)
            }
        }
        return stack.isEmpty();
    }
    boolean solution(String s) {
        boolean ans = false;
        int cnt = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '('){
                cnt++;
            }
            if(s.charAt(i) == ')'){
                cnt--;
            }
            if(cnt < 0){
                break;
            }
        }
        if(cnt == 0){
            ans = true;
        }

        return ans;
    }


}
