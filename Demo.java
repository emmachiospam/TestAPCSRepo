public class Demo {


  public static void main(String[] args) {
    // if (args.length > 0) {
    //   cw9.printLoop(Integer.parseInt(args[0]));
    // }
    // else {
    //   cw9.printLoop(5);
    // }
    System.out.println(arrayDeepToString(create2DArrayRadomized(6,10,3)).replaceAll("}, ","}\n"));
  }

  public static String arrToString(int[] arr){
  String result = "{";
  if(arr.length > 0) {
    for(int i = 0; i < arr.length-1; i++) {
      result = result + Integer.toString(arr[i]);
      result = result + ", ";
    }
    result = result + Integer.toString(arr[arr.length-1]);
  }
  result = result + "}";
  return result;
  }

  public static String arrayDeepToString(int[][] arr) {
    String ar = "";
    for(int i = 0; i < arr.length; i++){
      if(i != arr.length-1) {
        ar = ar + arrToString(arr[i]) + ", ";
      }
      else{
        ar = ar + arrToString(arr[i]);
      }
    }
    return ar;
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue) {
    int[][] array = new int[rows][cols];
    for(int k = 0; k < rows; k++) {
      int x;
      for(int i = 0; i < cols; i++) {
        array[k] = new int[cols];
        for(int j = 0; j < cols; j++) {
          x = (int)Math.round(Math.random() * (maxValue));
          array[k][j] = x;
        }
      }
    }
    return array;
  }

  public static int[][] create2DArrayRadomized(int rows, int cols, int maxValue) {
    int[][] array = new int[rows][];
    for(int k = 0; k < rows; k++) {
      int cols2 = (int)Math.round(Math.random() * (cols + 1));
      int[] arrCol = new int[cols2];
      array[k] = arrCol;
      for(int j = 0; j < cols2; j++) {
        int x = (int)Math.round(Math.random() * (maxValue));
        array[k][j] = x;
      }
    }
    return array;
  }


}
