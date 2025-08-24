import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class indiancoin{
    public static void main(String[]  args){
    //     Scanner in = new Scanner(System.in);
    //     int n =in.nextInt();
    //   int arr[]= new int[n];
    //     for(int i=0;i<n;i++){
    //         arr[i]=in.nextInt();

     Integer coins []={1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins, Collections.reverseOrder());
         int countCoin =0;
         int amout =121;
         ArrayList<Integer> ans =new ArrayList<>();
            int i=0;
         while(i<coins.length){
            if(coins[i]<=amout){
                 amout= amout-coins[i];
                 countCoin++;
                 ans.add(coins[i]);


            }else{
                i++;
            }
         }
         for(int j=0;j<ans.size();j++){
            System.out.println(ans.get(j));
         }
          System.out.println(countCoin);
    } 

}