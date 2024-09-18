import java.util.Arrays;

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
        Arrays.sort(citations);
        int length = citations.length;

        int i = 0;
        int h = 0;
        int cand = 0;
        while (i <= length) {
            cand = binarySearch(citations, i);

            if ((length-1) - cand + 1 >= i){
                h = Math.max(h, i);
            }

            i+=1;
        }

        return h;
    }

}
