public class subString {

    public static void findSubset(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
           
            }
             return;
            
        }

        // recursion 
        // yes choice
        findSubset(str, ans + str.charAt(i), i + 1);

        // no choice
        findSubset(str, ans, i + 1);
    }

    public static void main(String args[]) {
        String str = "abc";
        findSubset(str, "", 0);
      
    }
}

/*// User function Template for Java

class Solution {
    public List<String> AllPossibleStrings(String s) {
        // Code here
        List<String> ans =new ArrayList<>();
        int n =s.length();
        findSub(s,0,"",ans);
          Collections.sort(ans);
         return ans;
    }
      public void findSub(String s,int index, String cur,List<String> ans){
          
          // base case
           if(index==s.length()){
             if (cur.length() == 0) {
                return;           // skip empty subsequence
            }else{
                ans.add(cur);
            }  return;
         }
         // work 
         // choce
         findSub(s,index+1, cur + s.charAt(index),ans);
         // no choice
         findSub(s,index+1,cur ,ans);
     }
} */