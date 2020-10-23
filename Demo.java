public class Demo {


  public static void main(String[] args) {
    if (args.length > 0) {
      cw9.printLoop(Integer.parseInt(args[0]));
    }
    else {
      cw9.printLoop(5);
    }
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
}
