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

 public static int sum(int[][] matrix){
  return sum(sumRows(matrix));
 }

 
 public static int[] sumCols(int[][] matrix){
  int[] x = new int[matrix[0].length];
  int y = 0;
  for(int i = 0; i < matrix[0].length; i++){
   for (int j = 0; j < matrix.length; j++){
    y += matrix[j][i];
   }
   x[i] = y;
   y = 0;
  }
  return x;
 }

 public static boolean isRowMagic(int[][] matrix){
  int[] x = new int[matrix.length]; 
  x = sumRows(matrix);
  for(int i = 0; i < matrix.length; i++){
   if (x[i] != x[0]){
    return false;
   }
  }
  return true;
 }

 public static boolean isColMagic(int[][] matrix){
  int[] x = new int[matrix.length]; 
  x = sumCols(matrix);
  for(int i = 0; i < matrix.length; i++){
   if (x[i] != x[0]){
    return false;
   }
  }
  return true;
 } 
 
 public static boolean isLocationMagic(int[][] matrix, int row, int col){
  int x = sum(matrix[row]);
  int y = 0;
  for(int i = 0; i < matrix[0].length; i++){
   y += matrix[col][i];
  }
  return x==y;
 }
 
}