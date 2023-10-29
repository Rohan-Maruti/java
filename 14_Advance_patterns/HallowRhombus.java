public class HallowRhombus {
    public static void rohombus(int r, int c) {
        for (int i = 1; i <= r; i++) {

            for (int j = 1; j <= (c - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= c; j++) {
                if (i == 1 || i == r || j == 1 || j == r) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        rohombus(6, 6);
    }
}
