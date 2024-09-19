import java.util.Arrays;
//  hidx (https://school.programmers.co.kr/learn/courses/30/lessons/42747)
public class Hidx {
    public int binarySearch(int[] array, int value) {
        int lower_bound = 0;
        int upper_bound = array.length - 1;

        while (lower_bound <= upper_bound) {
            int midpoint = (lower_bound + upper_bound) / 2;
            int midvalue = array[midpoint];

            if (midvalue == value)  return midpoint;
            else if (midvalue > value) upper_bound = midpoint - 1;
            else if (midvalue < value)  lower_bound = midpoint + 1;
        }

        return lower_bound;

    }
    public int solution(int[] citations) {
        Arrays.sort(citations); // 원본배열을 정렬
        int length = citations.length;

        int i = 0;
        int h = 0;
        int cand = 0;
        while (i <= length) { //i=> h값의 후보. h값을 찾을때까지 length까지 반복
            //h 이상 인용된 논문의 수 -> element의 값이 h 이상이다 -> 어떤 element가 h값? -> h값의 인덱스?
            cand = binarySearch(citations, i);

            if ((length-1) - cand + 1 >= i){
                h = Math.max(h, i); //현재 후보와, 기존 후보 중 큰 값을 선택(최댓값을 찾아야하므로)
            }

            i+=1;
        }

        return h;
    }

}
