import java.util.Arrays;
import java.util.Comparator;

public class knapsack {
    public static void main(String [] args){
    int val[] ={60,100,120};
    int weight[]={10,20,30};
    int w =50;
   
      double ratio[][] =new double[val.length][2];
      //oth col => idx 1thcol ratio

      for(int i=0;i<val.length;i++){
        ratio[i][0]=i;
        ratio[i][1]= val[i]/(double)weight[i];
        //insertion done
      }

      Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
      int capa=w;
      int ans=0;
      for(int i=ratio.length-1;i>=0;i--){
        int idx =(int)ratio[i][0];
        // by this idx we fetch the value of the weigth and val array
        if(capa>=weight[idx]){ // include full weight
            ans+=val[idx];
            capa-=weight[idx];
        }else{
            ans+=(ratio[i][1]*capa);
            capa=0;break;
        }
      }
      System.out.println("final value = "+ ans);

    }
}
