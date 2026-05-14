import java.util.*;


public class S{
    String s = "paypalishiring";
    int num =4;
    StringBuilder sb = new StringBuilder();
    
    void print(){
        int up=1;
        int down=1;
        for (int i = 0; i < s.length(); i++) {
            if(i<=3){
                System.out.print(s.charAt(i));
                sb.append(s.charAt(i));
                down++;
            }
            while(up<3){
                if(down==3){
                System.out.println(s.charAt(i));
                sb.append(s.charAt(i));
                down = 1;
                up++;
                

            }







            }
            




            
        }


    }





    public static void main(String[] args) {
        S ss = new S();
        ss.print();
        
    }
}