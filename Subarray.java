public class Subarray {

    int arr[] = {1, 3, 4, 6, 5, 2, 7, 9, 10};

    void sss() {

        int max = 0;

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                int product = 1;

                for (int k = i; k <= j; k++) {

                    System.out.print(arr[k] + " ");
                    product = product * arr[k];
                }

                if (product > max) {
                    max = product;
                    start = i;
                    end = j;
                }

                System.out.print(" -> Product = " + product);
                System.out.println();
            }
        }

        System.out.println("\nMaximum Product = " + max);

        System.out.print("Subarray = ");

        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Subarray a = new Subarray();
        a.sss();
    }
}