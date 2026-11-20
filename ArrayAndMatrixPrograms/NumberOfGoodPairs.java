import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class NumberOfGoodPairs {
 public static int numIdenticalPairs(int[] nums) {
  Map<Integer,Integer> counts=new HashMap<>();
  int pairs=0;
  for(int num:nums) {
   int count=counts.getOrDefault(num,0);
   pairs+=count;
   counts.put(num,count+1);
  }
  return pairs;
 }
 public static void main(String[] args) {
  int[] nums={1,2,3,1,1,3};
  System.out.println("Input array: "+Arrays.toString(nums));
  System.out.println("Good pairs: "+numIdenticalPairs(nums));
 }
}