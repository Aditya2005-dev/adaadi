class Solution {
    public int reverse(int x) {
        int num = 0;

        while (x != 0) {

            if (x > 0) {
                int ld = x % 10;
                num = num * 10 + ld;
                x = x / 10;

            }

            else if (x < 0) {
                int ld = x % 10;
                num = num * 10 + ld;
                x = x / 10;
                
                num = num*-1;
            }

            else if (x % 10 == 0) {
                //this just once
                x = x / 10;

                // then
                int ld = x % 10;
                num = num * 10 + ld;
                x = x / 10;

            }
        }

        return num;
    }
}