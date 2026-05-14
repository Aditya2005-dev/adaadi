import java.util.*;

public class Compression {
    String s = "aaabbcdddddd";

    String d(){
        int i = 0;
        int count = 1;
        String str = "";

        while(i < s.length() - 1){
            if (s.charAt(i) == s.charAt(i+1)) {
                count++;
            } else {
                str = str + s.charAt(i) + count; // store
                count = 1;
            }
            i++; // move once
        }

        // last character
        str = str + s.charAt(i) + count;

        return str;
    }

    public static void main(String[] args) {
        Compression com = new Compression();
        System.out.println(com.d());
    }
}