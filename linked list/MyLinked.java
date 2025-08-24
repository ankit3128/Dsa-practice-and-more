public class MyLinked{
    public static class node{
     int data;
     node next;
      public node(int data){
        this.data=data;
        this.next=null;
      }   
    }
     public static node head;
     public static node tail;
     public static int size;


     //Methods
        public void addFirst(int data){
            node newNode=new node(data);
                size++;
             if(head==null){
                head=tail=newNode;
                return;
             }
            // step1 =cretae a new node
             newNode.next=head;
             head =newNode;
        }

        public void addlast(int data){
            node newNode =new node(data);
            size++;
          while(head==null){
            head=tail=newNode;
          }  
          tail.next=newNode;
          tail=newNode;

        }
        public void traverse(){
            if(head==null){
                System.out.println("linked list is empty");
                return;

            }

          node temp=head;
          while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;

          } 
           System.out.println("null"); 
        }

    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        node newNode =new node(data);
        size++;
        node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    } 
    public int removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;

        } else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        } size--;
       
        int val =head.data;
        head=head.next;
        return val;
    }
     public int removeLast() {
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
          else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
          }
        node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;

        }
        int val =prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;


    }
    public int itrSearch(int key){
        node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;

        }
         return -1;

    }
      public int recSearch(int key){
         return helper(head,key);
      }
    public int helper(node head,int key){
        if(head ==null){ //base case
            return -1;
        }
        if(head.data==key){
            return 0;
        } 
        int idx =helper(head.next,key);
        if(idx ==-1){
            return -1;
        }
        return idx+1;
    }
     public void reverse(){
        node prev=null;
        node curr =tail=head;
        node next;
         
        while(curr!=null){
            next =curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        head =prev;
     }
     public void deleteNodeFromEnd(int n){
        // claculate the size of the ll
        int sz=0;
        node temp =head;
        while(temp.next!=null){
            temp=temp.next;
            sz++;
                }
        if(sz==n){
            head=head.next;

        }
         node prev =head;
        int i=0;
        int iToFind=sz-n;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return ;
     }
     public node findMid(node head){
        node slow=head;
        node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast =fast.next.next;
        } 
        return slow;

     }

    
    public boolean checkPalindrome(){
        //step 1-find mid step2 reverse 2nd half 3 chack left and right half
        if(head==null || head.next==null){
            return true;

        }
        node midNode=findMid(head);
         
         node prev=null;
         node curr =midNode;
         node next;
          while(curr !=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
          }
          node right= prev ; // right half head
          node left =head;

          while(right!=null){
            if(left.data!= right.data){
                return false;
            }
            left =left.next;
            right =right.next;

          }
           return true;


    }
     public static boolean isCycle(){
        node slow =head;
        node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast =fast.next.next;
            if(slow==fast){
                return true; // cycle exist
            }
        } 
        return false;
     }
      public static void removeCycle(){
        // detect cycle
        node slow=head;
        node fast =head;
        boolean cycle =false;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
         if(cycle==false){
            return;
         }
         // find meeting point
         slow=head;
         node prev=null;
         while(slow!=fast){
            prev= fast;
            slow=slow.next;
            fast=fast.next;
         }
         // remove cycle
         prev.next=null;

      }
   
    public static void main(String args[]){
        MyLinked ll=new MyLinked();
     
        // ll.addFirst(2);
        
        // ll.addFirst(1);
    
        // ll.addlast(3);
       
        // ll.addlast(4);
        // ll.add(2,9);
        
        // ll.traverse();
        // // ll.removeFirst();
        // // ll.removeLast();
        // ll.traverse();
        // // ll.reverse();
        // // ll.deleteNodeFromEnd(3 );
        // ll.traverse();
        
        // // System.out.println(ll.size);
        // // System.out.println(ll.recSearch(9));
        // // System.out.println(ll.recSearch(19));
            // ll.addlast(1);
            // ll.addlast(2);
            // ll.addlast(2);
            // ll.addlast(1);
            // System.out.print(ll.checkPalindrome());
         

            // to check cycle in ll
            head =new node(1);
            head.next =new node(2);
            head.next.next =new node(3);
            head.next.next.next =head;
            System.out.println(isCycle());
            
    }
}