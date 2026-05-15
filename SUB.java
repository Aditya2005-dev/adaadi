public class SUB {

    int arr[] = {1, 2, 3};
    int start = 0;
    int end = 0;
    int max = Integer.MIN_VALUE;

    void ss() {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                int product = 1;

                for (int j2 = i; j2 <= j; j2++) {

                    System.out.print(arr[j2] + " ");
                    product = product * arr[j2];
                    if(product>max){
                        max = product;
                        start = i;
                        end = j;
                        
                    }
                }

                System.out.println(" -> Product = " + product);
            }
        }
        System.out.println(max+": Largest product ");
        for (int kk = start; kk <= end ; kk++) {
            System.out.print(arr[kk]+" ");
            
        }
    }

    public static void main(String[] args) {

        SUB obj = new SUB();
        obj.ss();
    }
}