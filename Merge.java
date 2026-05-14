import java.util.*;

public class Merge {
    ArrayList<Integer> a = new ArrayList<>();
    int arr[] = {1,3,5,7,9};
    int arr2[] = {2,4,6,8,10};
    void mergesorted1(){
        int i=0;
        int j=0;

        while(i<arr.length&&j<arr2.length){
            if(arr[i]<arr2[j]){
                a.add(arr[i]);
                i++;
            }
            else{
                a.add(arr2[j]);
                j++;
            }
        }

        while(i<arr.length){
            a.add(arr[i]);
            i++;

        }

        while(j<arr2.length){
            a.add(arr2[j]);
            j++;

        }



        System.out.print(a);
        System.out.println("");
        System.out.println(arr.length);
        System.out.println(arr2.length);
    }

    public static void main(String[] args) {
        Merge m = new Merge();
        m.mergesorted1();
        
    }
    
}
