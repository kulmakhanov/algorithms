
public class Main {

    public static void main(String[] args) {
        int[] arr = { 3, 8, 5, 4, 1, 9, -2 };

        for (int i = 1; i < arr.length; i++) {
            int currValue = arr[i];
            int j = i;

            while (j > 0 && arr[j - 1] > currValue) {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = currValue;
        }
        
        for (int elem : arr) {
            System.out.println(elem);
        }

    }

}
