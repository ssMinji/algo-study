public class BinarySearch {
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
}

