import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class kSumSubArray {
    public static void main(String[] args){
        int arr []= {2,8,2,6,-6,3,2};
        // boolean found =checkkSumSubarray(arr,5);
        // System.out.println("found->" + found);

        ArrayList<Integer> res =findKSumSubarray(arr,5);
        if(res.get(0)==-1){
            System.out.println("not found");
            return;
        }
         System.out.println( "res ->" + res.get(0) + res.get(1)  );
    }
     public static boolean checkkSumSubarray(int arr[],int k){
       HashSet<Integer> mySet =new HashSet<>();
       mySet.add(0);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
            int rem =sum-k;
            if(mySet.contains(rem)){
                return true;
            } mySet.add(sum);

        }


        return false;
     }
      public static ArrayList<Integer> findKSumSubarray(int arr[],int k){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(-1);//no answer case

        HashMap<Integer,Integer> myMap= new HashMap<>();
        myMap.put(0,-1);
        int sum =0;
        

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int rem =sum -k;
            if(myMap.containsKey(rem)){
                int si = myMap.get(rem)+1;
                list.set(0,si);
                list.add(i);
                break;

            
            }
             myMap.put(sum,i);


        }
         


        return list;
      }
}
