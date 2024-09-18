import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j< nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
// 최악의 경우 nums 리스트를 다 훑어야 하므로 O(n^2)
// 공간복잡도
// 다른 배열에 복사하는 과정은 없고, i와 j 지역변수만을 사용하므로 O(1)의 복잡도
    public int[] twoSumDict(int[] nums, int target) {
        HashMap<Integer, Integer> num = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int res = target - nums[i];
            if(num.containsKey(res)) {  // dicts 의 검색 시간 복잡도: O(1)
                return new int[]{i, num.get(res)};
            }
            num.put(nums[i], i);
        }
        return null;
    }
}
// 시간복잡도: O(N)
// 공간복잡도: O(N) : 해시테이블 객체 만들기 때문