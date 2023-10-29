public class zeroOnetriangle{
    public static void zeonetri(int r,int c){
        for(int i = 1;i<=r;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                if((i+j)%2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main (String args[])
    {
        zeonetri(5, 5);
        
    }
}