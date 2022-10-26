public class   Pattern4 {
  public static void main(String[] args) {
    int i, j;
    int n = 8;
    for (i = 0; i < n; i++) {
      for (j = 0; j < 14; j++) {
        if (i <= 7 && i > 6)
          System.out.print("*");
        else if (j <= i || j >= (13 - i))       
          System.out.print("*");    
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}