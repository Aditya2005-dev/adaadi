import java.util.*;

public class TranspositionCipher {

    // -------- ENCRYPT --------
    public static String encrypt(String text, int key) {
        StringBuilder cipher = new StringBuilder();

        for (int col = 0; col < key; col++) {
            int pointer = col;
            while (pointer < text.length()) {
                cipher.append(text.charAt(pointer));
                pointer += key;
            }
        }
        return cipher.toString();
    }

    // -------- DECRYPT --------
    public static String decrypt(String cipher, int key) {

        int numOfColumns = (int) Math.ceil((double) cipher.length() / key);
        int numOfRows = key;
        int numOfShadedBoxes = (numOfColumns * numOfRows) - cipher.length();

        char[][] grid = new char[numOfRows][numOfColumns];

        int row = 0, col = 0;

        for (int i = 0; i < cipher.length(); i++) {
            grid[row][col] = cipher.charAt(i);
            col++;

            if (col == numOfColumns || (col == numOfColumns - 1 && row >= numOfRows - numOfShadedBoxes)) {
                col = 0;
                row++;
            }
        }

        // Read row-wise
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < numOfColumns; i++) {
            for (int j = 0; j < numOfRows; j++) {
                if (grid[j][i] != 0) {
                    text.append(grid[j][i]);
                }
            }
        }

        return text.toString();
    }

    public static void main(String[] args) {

        String text = "hellon world";
        int key = 4;

        String encrypted = encrypt(text, key);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = decrypt(encrypted, key);
        System.out.println("Decrypted: " + decrypted);
    }
}