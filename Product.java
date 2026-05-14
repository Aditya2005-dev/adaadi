public class Product {
    int arr[] = {1,2,3,4};

    void pro(){
        for (int i = 0; i < arr.length; i++) {

            int product = 1;

            for (int j = 0; j < arr.length; j++) {

                if(i == j){
                    continue;   // skip same index
                }

                product = product * arr[j];
            }

            System.out.print(product + " ");
        }
    }

    public static void main(String[] args) {
        Product pp = new Product();
        pp.pro();
    }
}