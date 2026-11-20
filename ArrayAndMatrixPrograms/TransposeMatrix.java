import java.util.Arrays;
public class TransposeMatrix {
 public static int[][] transpose(int[][] matrix) {
  int rows=matrix.length,cols=matrix[0].length;
  int[][] result=new int[cols][rows];
  for(int r=0;r<rows;r++)
   for(int c=0;c<cols;c++) result[c][r]=matrix[r][c];
  return result;
 }
 public static void main(String[] args) {
  int[][] matrix={{1,2,3},{4,5,6}};
  for(int[] row:transpose(matrix)) System.out.println(Arrays.toString(row));
 }
}