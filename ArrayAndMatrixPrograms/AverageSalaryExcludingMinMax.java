import java.util.Arrays;
public class AverageSalaryExcludingMinMax {
 public static double average(int[] salary) {
  int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
  long sum=0;
  for(int value:salary) {
   sum+=value;
   min=Math.min(min,value);
   max=Math.max(max,value);
  }
  return (double)(sum-min-max)/(salary.length-2);
 }
 public static void main(String[] args) {
  int[] salary={4000,3000,1000,2000};
  System.out.println("Salaries: "+Arrays.toString(salary));
  System.out.println("Average: "+average(salary));
 }
}