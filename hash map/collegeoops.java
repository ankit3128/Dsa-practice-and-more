 class student { 
    int roll ;
    String name;
    int age;
    
student(){
     roll =43;
     name ="ankit singh";
     age =19;


}
student( int a,String s,int b){
    this.age=b;
    this.roll=a;
    this.name=s;

}
void display() {
    System.out.println("Roll: " + roll);
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
}

 }
 
public class collegeoops {
    public static void main(String[] args){
        student s1=new student(23,"ankit",45);
        // System.out.println( s1.age  + s1.roll  + s1.age );
        // System.out.println(+ s1.age   + s1.roll +   s1.age);
        System.out.printf("Age: %d, Roll: %d,  name  %s\n", s1.age, s1.roll, s1.name);


    //    s1.display();
    //    System.out.println(s1.display());

    }


    
}
