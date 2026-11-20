import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class LuckyNumbersInMatrix {
 public static List<Integer> luckyNumbers(int[][] matrix) {
  int rows=matrix.length,cols=matrix[0].length;
  int[] minRow=new int[rows],maxCol=new int[cols];
  Arrays.fill(minRow,Integer.MAX_VALUE);
  Arrays.fill(maxCol,Integer.MIN_VALUE);
  for(int r=0;r<rows;r++) {
   for(int c=0;c<cols;c++) {
    minRow[r]=Math.min(minRow[r],matrix[r][c]);
    maxCol[c]=Math.max(maxCol[c],matrix[r][c]);
   }
  }
  List<Integer> result=new ArrayList<>();
  for(int r=0;r<rows;r++)
   for(int c=0;c<cols;c++)
    if(matrix[r][c]==minRow[r] && matrix[r][c]==maxCol[c])
     result.add(matrix[r][c]);
  return result;
 }
 public static void main(String[] args) {
  int[][] matrix={{3,7,8},{9,11,13},{15,16,17}};
  System.out.println("Lucky numbers: "+luckyNumbers(matrix));
 }
}