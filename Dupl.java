import java.util.*;

public class Dupl {
    // 1 , 2 ,2 , 3
    int a[] = {1,2,2,3,3,3,3,2,2,4,5,5,5,5,6,6,6,6,5,4,3,2,1,8,7,9};
    int x = a.length;
    void sss(){
        Arrays.sort(a);
        int count=0;

        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if(a[j]==a[j+1]){
                    int swap = a[j];
                    a[j] = a[j+1];
                    a[j+1] = swap;
                    count++;
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i < count; i++) {
            
            System.out.print(a[i]);
        }
        System.out.print("]");
        

    }
    

    public static void main(String[] args) {
        Dupl f = new Dupl();
        f.sss();
        
    }
    
}
