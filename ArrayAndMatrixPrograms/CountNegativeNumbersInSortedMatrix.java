import java.util.Arrays;
public class CountNegativeNumbersInSortedMatrix {
 public static int countNegatives(int[][] grid) {
  int count=0;
  for(int[] row:grid)
   for(int value:row)
    if(value<0) count++;
  return count;
 }
 public static void main(String[] args) {
  int[][] grid={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
  for(int[] row:grid) System.out.println(Arrays.toString(row));
  System.out.println("Negative numbers: "+countNegatives(grid));
 }
}