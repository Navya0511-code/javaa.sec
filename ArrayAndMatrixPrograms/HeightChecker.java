import java.util.Arrays;
public class HeightChecker {
 public static int heightChecker(int[] heights) {
  int[] sorted=heights.clone();
  Arrays.sort(sorted);
  int count=0;
  for(int i=0;i<heights.length;i++)
   if(heights[i]!=sorted[i]) count++;
  return count;
 }
 public static void main(String[] args) {
  int[] heights={1,1,4,2,1,3};
  System.out.println("Heights: "+Arrays.toString(heights));
  System.out.println("Mismatched positions: "+heightChecker(heights));
 }
}