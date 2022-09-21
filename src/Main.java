public class Main {
    public static void main(String[] args) {

        int[] arr = {-9, -2, -6, -4, -5, -12, -7, -8, -6};

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}