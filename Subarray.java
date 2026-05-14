public class Subarray {

    int arr[] = {1, 3, 4, 6, 5, 2, 7, 9, 10};

    void sss() {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }

                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        Subarray a = new Subarray();
        a.sss();

    }
}