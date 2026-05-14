public class Selection {

    int arr[] = {6, 1, 9, 10};

    void swap(int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void selectionsort() {

        for (int i = 0; i < arr.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            swap(i, min);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Selection sort = new Selection();

        sort.selectionsort();
    }
}