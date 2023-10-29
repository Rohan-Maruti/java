
public class Diamond {
    public static void diamond(int r, int c) {
        for (int i = 1; i <= r; i++) {

            for (int j = 1; j <= (c - i); j++) {
                System.out.print(" ");
            }
            // for (int g = 1; g <= i; g++) {
                // System.out.print("*");
            // }
            // for (int g = 1; g < i; g++) {
                // System.out.print("*");
            // }

            // we have alternate easy way by witing in odd method using (2x -1)
            for(int g = 1;g<=((2*i)-1);g++){
                 System.out.print("*");
            }
            System.out.println();
        }

        for (int i = r; i >=1; i--) {
            for (int j = 1; j <= (c - i); j++) {
                System.out.print(" ");
            }
            for (int g = 1; g <= i; g++) {
                System.out.print("*");
            }
            for (int g = 1; g < i; g++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        diamond(4, 4);
    }
}
