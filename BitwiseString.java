public class BitwiseString {

    public static void main(String[] args) {

        String str = "hello world";

        System.out.println("AND Operation:"+"\n");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println((ch & 127));
        }

        System.out.println("\n");

        System.out.println("OR Operation:");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println((char)(ch | 127));
        }

        System.out.println("\n");

        System.out.println("XOR Operation:");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.print((char)(ch ^ 127));
        }
    }
}