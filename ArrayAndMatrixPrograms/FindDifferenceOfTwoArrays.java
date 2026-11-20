import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class FindDifferenceOfTwoArrays {
 public static List<List<Integer>> findDifference(int[] nums1,int[] nums2) {
  Set<Integer> first=new HashSet<>(),second=new HashSet<>();
  for(int num:nums1) first.add(num);
  for(int num:nums2) second.add(num);
  List<Integer> onlyFirst=new ArrayList<>(),onlySecond=new ArrayList<>();
  for(int num:first) if(!second.contains(num)) onlyFirst.add(num);
  for(int num:second) if(!first.contains(num)) onlySecond.add(num);
  List<List<Integer>> result=new ArrayList<>();
  result.add(onlyFirst);
  result.add(onlySecond);
  return result;
 }
 public static void main(String[] args) {
  int[] a={1,2,3},b={2,4,6};
  System.out.println(findDifference(a,b));
 }
}