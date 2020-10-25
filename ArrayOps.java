public class ArrayOps{
 public static int sum(int[] arr){
  int x = 0;
  for(int i = 0; i < arr.length; i++){
   x+= arr[i];
  }
  return x;
 }

 public static int largest(int[] arr){
  int x = 0;
  for (int i = 0; i <arr.length; i++){
   x = Math.max(x, arr[i]);
  }
  return x;
 }
 
 public static int[] sumRows(int[][] matrix){
  int[] arr = new int[matrix.length];
  for(int i = 0; i < matrix.length; i++){
   arr[i] = sum(matrix[i]);
  }
  return arr;
 }

 public static int[] largestInRows(int[][] matrix){
  int[]arr = new int[matrix.length];
  for(int i = 0; i < matrix.length; i++){
   arr[i] = largest(matrix[i]);
  }
  return arr;
 }

}