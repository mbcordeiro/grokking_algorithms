public class BinarySearch {
    public static void main(String[] args) {
        final int[] myList = {1, 3, 5, 7, 9};
        System.out.println(binarySearch(myList, 3)); //1
        System.out.println(binarySearch(myList, -3)); // null
    }

    private static Integer  binarySearch(final int[] list, final int item) {
        int small = 0;
        int high = list.length - 1;
        while (small <= high) {
            final int mid  = (small + high) / 2;
            final var guess = list[mid];
            if (guess == item)
                return mid ;
            if (guess > item)
                high = mid  - 1;
            else
                small = mid  + 1;
        }
        return null;
    }
}
