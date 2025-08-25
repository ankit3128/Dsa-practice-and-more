

public class heigthbtree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void main(String[] args) {
        
        Node root =new Node(1);
        root.left=new Node(2);
        root.right =new Node(3);
        root.left.left =new Node(4);
        root.left.right =new Node(5);
        root.right.right =new Node(6);
        root.right.left =new Node(7);
 System.out.println(maxDepth(root));
  System.out.println(count(root));
   System.out.println(sum(root));
      
  }
  public static int maxDepth(Node root){
      if(root==null){
            return 0;
            // here we check the for the null value

        }
         int lh=maxDepth(root.left); // this go to the deep of left 
         int rh =maxDepth(root.right);
      return Math.max(lh,rh)+1;
  }
   public static  int count(Node root){
    if(root ==null){
        return 0;

    }
     int lc =count(root.left);
      int rc =count(root.right);
       return (lc+rc)+1;
   }
   public static int sum(Node root){
    if(root==null){
        return 0;

    }
    int ls =sum(root.left);
    int rs=sum(root.right);
    return ls+rs+root.data;
   }
}
