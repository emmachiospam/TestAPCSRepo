public class cw9{

  public static void printLoop(int n) {
    for(int i = 1; i <= n; i++) {
      for(int j = 0; j <= (n - i); j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
      printLoop(5);
  }


}
