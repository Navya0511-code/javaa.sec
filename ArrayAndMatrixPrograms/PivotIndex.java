import java.util.Arrays;
public class PivotIndex {
 public static int pivotIndex(int[] nums) {
  int total=0;
  for(int num:nums) total+=num;
  int left=0;
  for(int i=0;i<nums.length;i++) {
   if(left==total-left-nums[i]) return i;
   left+=nums[i];
  }
  return -1;
 }
 public static void main(String[] args) {
  int[] nums={1,7,3,6,5,6};
  System.out.println("Input array: "+Arrays.toString(nums));
  System.out.println("Pivot index: "+pivotIndex(nums));
 }
}