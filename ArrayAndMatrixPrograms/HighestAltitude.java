import java.util.Arrays;
public class HighestAltitude {
 public static int largestAltitude(int[] gain) {
  int current=0,highest=0;
  for(int change:gain) {
   current+=change;
   highest=Math.max(highest,current);
  }
  return highest;
 }
 public static void main(String[] args) {
  int[] gain={-5,1,5,0,-7};
  System.out.println("Gain array: "+Arrays.toString(gain));
  System.out.println("Highest altitude: "+largestAltitude(gain));
 }
}