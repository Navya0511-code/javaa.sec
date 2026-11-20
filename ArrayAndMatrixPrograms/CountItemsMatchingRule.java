import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CountItemsMatchingRule {
 public static int countMatches(List<List<String>> items,String ruleKey,String ruleValue) {
  int index;
  if(ruleKey.equals("type")) index=0;
  else if(ruleKey.equals("color")) index=1;
  else if(ruleKey.equals("name")) index=2;
  else return 0;
  int count=0;
  for(List<String> item:items)
   if(item.get(index).equals(ruleValue)) count++;
  return count;
 }
 public static void main(String[] args) {
  List<List<String>> items=new ArrayList<>();
  items.add(Arrays.asList("phone","blue","pixel"));
  items.add(Arrays.asList("computer","silver","lenovo"));
  items.add(Arrays.asList("phone","gold","iphone"));
  System.out.println("Matching items: "+countMatches(items,"color","silver"));
 }
}