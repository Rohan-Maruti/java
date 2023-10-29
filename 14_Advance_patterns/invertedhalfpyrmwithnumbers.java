
public class invertedhalfpyrmwithnumbers {
    public static void invpyrmnum(int r,int c){
        for(int i = 0;i<=r ;i++){
            for(int j = 1;j<=c-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
       invpyrmnum(5, 5);
    }
}
