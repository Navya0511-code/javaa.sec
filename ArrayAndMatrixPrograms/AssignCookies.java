import java.util.Arrays;
public class AssignCookies {
 public static int findContentChildren(int[] g,int[] s) {
  Arrays.sort(g);
  Arrays.sort(s);
  int child=0,cookie=0;
  while(child<g.length && cookie<s.length) {
   if(s[cookie]>=g[child]) child++;
   cookie++;
  }
  return child;
 }
 public static void main(String[] args) {
  int[] greed={1,2,3},cookies={1,1};
  System.out.println("Content children: "+findContentChildren(greed,cookies));
 }
}