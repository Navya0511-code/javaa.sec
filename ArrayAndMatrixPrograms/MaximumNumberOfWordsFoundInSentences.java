public class MaximumNumberOfWordsFoundInSentences {
 public static int mostWordsFound(String[] sentences) {
  int max=0;
  for(String sentence:sentences) {
   String trimmed=sentence.trim();
   int words=trimmed.isEmpty()?0:trimmed.split("\\s+").length;
   max=Math.max(max,words);
  }
  return max;
 }
 public static void main(String[] args) {
  String[] sentences={"alice and bob love leetcode","i think so too",
                      "this is great thanks very much"};
  System.out.println("Maximum words: "+mostWordsFound(sentences));
 }
}