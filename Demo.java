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

}
