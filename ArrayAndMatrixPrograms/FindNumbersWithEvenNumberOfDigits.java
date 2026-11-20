import java.util.Arrays;
public class FindNumbersWithEvenNumberOfDigits {
 public static int findNumbers(int[] nums) {
  int count=0;
  for(int num:nums) {
   int digits=String.valueOf(Math.abs((long)num)).length();
   if(digits%2==0) count++;
  }
  return count;
 }
 public static void main(String[] args) {
  int[] nums={12,345,2,6,7896};
  System.out.println("Input array: "+Arrays.toString(nums));
  System.out.println("Numbers with even digits: "+findNumbers(nums));
 }
}