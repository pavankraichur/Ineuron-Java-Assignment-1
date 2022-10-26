public class pattern5 {
    public static void main (String [] args){
        int i,j,k;
        int n=7;
        for (i=0;i<14;i++) {
            for (j=0;j<14;j++){
                if(i==0 || i==13)
                System.out.print("*");
                else if (j< (n-i))
                System.out.print("*");
                else 
                System.out.println(" ");
            }
            for (k=0;k<14;k++){
               if (k<=(i-n+1) && i>=7)
                System.out.print("*");
                else 
                System.out.println(" ");
            }
           System.out.println("");
        }
         
    }
}