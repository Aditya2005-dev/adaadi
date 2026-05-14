public class Binaryyyy {

    void bb(){
    int arr[] = {1,2,3,4,5,6,7,8,9,10};
    
    int left = 0;
    int right = arr.length;
    int mid = (right+left)/2;
    int target = 4;

    while(right<left){
        if(arr[mid]==target){/
            System.out.println(mid);
        }

        if(target<mid){
            left = mid - 1;
        }

        if(target>mid){
            right= mid + 1;
        }


    }
}
    public static void main(String[] args) {
        Binaryyyy bb = new Binaryyyy();
        bb.bb();
        
    }
    
}
