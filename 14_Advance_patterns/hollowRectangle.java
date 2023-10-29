import java.util.*;
public class hollowRectangle {
    public static void hollowRectangl(int row,int clm){
        // for rows
        for(int i = 1;i<=row;i++){
            // for coloums
            for(int j = 1;j<=clm ;j++){
                // for boundaries
                if(i == 1 || i == row || j == 1 || j == clm){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String args[])
    {
         hollowRectangl(4, 5);
    }
}
