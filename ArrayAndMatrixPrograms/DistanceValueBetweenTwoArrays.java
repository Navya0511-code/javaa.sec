import java.util.Arrays;
public class DistanceValueBetweenTwoArrays {
 public static int findTheDistanceValue(int[] arr1,int[] arr2,int d) {
  int count=0;
  for(int value:arr1) {
   boolean valid=true;
   for(int other:arr2) {
    if(Math.abs((long)value-other)<=d) {
     valid=false;
     break;
    }
   }
   if(valid) count++;
  }
  return count;
 }
 public static void main(String[] args) {
  int[] a={4,5,8},b={10,9,1,8};
  System.out.println("Distance value: "+findTheDistanceValue(a,b,2));
 }
}