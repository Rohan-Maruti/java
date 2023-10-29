import java.util.*;

public class invertedandrotatedHalfpyramid {
    public static void invhalfpyr(int r, int clm) {
        for (int i = 1; i <= r; i++) {
            // for(int j = 0;j<(clm - i);j++){
            // System.out.print(" ");
            // }
            for (int j = 1; j <= (clm - i); j++) {
                System.out.print(" ");
            }
            for (int u = 1; u <= i; u++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        invhalfpyr(4, 4);
    }
}
