import java.util.*;

public class maxLenChain {
 public static void main(String [] args){
 int pair[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
  
 Arrays.sort(pair,Comparator.comparingDouble(o->o[1]));
 int ans =1; //chainlen
 int chainEnd= pair[0][1];// assigned the last element to end
 for(int i=1;i<pair.length;i++){
    if(pair[i][0]>chainEnd){
        ans++;
        chainEnd=pair[i][1];
    }
 }
System.out.println("maxlength of chain"+ ans);

 }     
}
