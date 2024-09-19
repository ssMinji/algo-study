public class BinarySearch {
    public static int binarySearch(int[] array, int value) {
        //먼저 찾으려는 값이 있을 수 있는 하한선, 상한선을 정한다
        int lower_bound = 0;
        int upper_bound = array.length - 1;

        //상한선과 하산선 사이의 가운데 값을 계속 확인하는 반복문을 돈다
        while (lower_bound <= upper_bound) {
            //# 상한선과 하한선의 중간지점을 찾는다
            int midpoint = (lower_bound + upper_bound) / 2;
            //# 중간지점의 값을 확인한다
            int midvalue = array[midpoint];

            // #중간 지점의 값이 찾고있던 값이면, 검색을 종료
            if (midvalue == value)  return midpoint;

            //그렇지않다면 , 상한선 혹은 하한선을 조정한다
            else if (midvalue > value) upper_bound = midpoint - 1;
            else if (midvalue < value)  lower_bound = midpoint + 1;
        }

        return lower_bound;

    }
    public static void main(String[] args) {
        int[] intArr = {3,17,21, 22, 75,80,202};
        int value = 81;
        System.out.println(binarySearch(intArr, value));
    }
}

