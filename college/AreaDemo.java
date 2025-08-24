// class shape {
//      public double computeArea( double r){
//             return  3.14*r*r;
//     }
//      public double computeArea(int l, int b){
//             return l*b;
//     } 
//   public class areaDemo{
//      public static void Main( String[] args){
//         shape circle =new shape();
//         circle.computeArea(4);
//      }
// }}


class Shape {
    public double computeArea(double r) {
        return 3.14 * r * r;
    }

    public double computeArea(int l, int b) {
        return l * b;
    }
}

public class AreaDemo {
    public static void main(String[] args) {
        Shape circle = new Shape();
        double area = circle.computeArea(4);  
        System.out.println("Area of Circle: " + area);

        Shape rectangle = new Shape();
        double rectArea = rectangle.computeArea(5, 6); 
        System.out.println("Area of Rectangle: " + rectArea);
    }
}
