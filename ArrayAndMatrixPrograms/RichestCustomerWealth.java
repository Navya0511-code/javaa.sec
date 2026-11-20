import java.util.Arrays;
public class RichestCustomerWealth {
 public static int maximumWealth(int[][] accounts) {
  int max=0;
  for(int[] account:accounts) {
   int wealth=0;
   for(int amount:account) wealth+=amount;
   max=Math.max(max,wealth);
  }
  return max;
 }
 public static void main(String[] args) {
  int[][] accounts={{1,2,3},{3,2,1},{2,8,7}};
  System.out.println("Accounts: "+Arrays.deepToString(accounts));
  System.out.println("Richest customer wealth: "+maximumWealth(accounts));
 }
}