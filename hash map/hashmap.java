import java.util.*;

public class hashmap{
    public static void main(String[] args){
    // HashMap<Integer,String> MyMap =new HashMap<>();
    //  MyMap.put(1,"ankit");
    //  MyMap.put(2,"a");
    //  MyMap.put(3,"kit");
    //  MyMap.put(4,"nkit");
    //  System.out.println(MyMap);
    //  System.out.println(MyMap.get(2));
   LinkedHashMap<String,Integer> lhm =new LinkedHashMap<>();
   lhm.put("india",150);
   lhm.put("usa",10);
   lhm.put("china",15);
   System.out.println(lhm);

    }
}