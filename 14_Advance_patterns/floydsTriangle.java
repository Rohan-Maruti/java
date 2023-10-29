
public class floydsTriangle {
    public static void floydtri(int r, int c){
        int conter = 1;
        for(int i = 1;i<=r ;i++)
        {
            for(int j = 1;j<=i;j++){
                System.out.print(conter+ " ");
                conter++;
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        floydtri(5,5);
    }
}
