public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 3, 0, 17, 6, 9, 3, 55, 1};
        int temp;
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }
            }
        }

        for (int elem : arr) {
            System.out.println(elem);
        }
    }
}
