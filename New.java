public class New {

    String s = "Hello World";

    void function() {

        for(int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);

            System.out.println((a & 127));
        }
		System.out.println("   ");
		System.out.println("   ");

		for(int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);

            System.out.println((a | 127));
        }
		System.out.println("   ");
		System.out.println("   ");

		for(int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);

            System.out.println((a ^ 127));
        }
    }

    public static void main(String[] args) {

        New n = new New();

        n.function();
    }
}