public class solidRhombus {
    public static void rohombus(int r, int c) {
        for (int i = 0; i <= r; i++) {
            for (int j = 0; j <= (c - i); j++)
            {
                System.out.print(" ");
            }
            for(int g = 0;g<=r;g++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        rohombus(6, 6);
    }
}
