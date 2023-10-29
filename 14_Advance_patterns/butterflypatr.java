
public class butterflypatr {
    public static void butterfly(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int u = 1; u <= (2 * (r - i)); u++) {
                System.out.print(" ");
            }
            for (int g = 1; g <= i; g++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = r; i >=0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int u = 1; u <= (2 * (r - i)); u++) {
                System.out.print(" ");
            }
            for (int g = 1; g <= i; g++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        butterfly(4, 4);
    }
}
