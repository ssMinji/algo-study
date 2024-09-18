import java.util.Stack;

public class Bracket {
    boolean solution2(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
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
