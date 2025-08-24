// package NEWFEATURES
@FunctionalInterface
interface Addition{
	public void add(int a,int b);
	default void defaultMethod() {
		System.out.println("This is addition default method");
	}
	static void staticMethod() {
		System.out.println("This is addition static method");
	}
}
// interface Subtraction{
// 	public void sub(int a,int b);
// 	default void defaultMethod() {
// 		System.out.println("This is  subtraction default method");

// 	}
// 	static void staticMethod() {
// 		System.out.println("This is subtraction static method");
// 	}
// }
// interface Multiply{
// 	public void mul(int a,int b);
// 	default void defaultMethod() {
// 		System.out.println("This is multiplication default method");
// 	}
// 	static void staticMethod() {
// 		System.out.println("This is multiplication static method");
// 	}
// }
// interface Division{
// 	public void divide(int a,int b);
// 	default void defaultMethod() {
// 		System.out.println("This is division default method");
// 	}
// 	static void staticMethod() {
// 		System.out.println("This is division static method");
// 	}
// }
public class DemoCalc {

	public static void main(String[] args) {
		int a= 10;
		int b = 2;
		Addition a1 = (x,y)->{System.out.println("Addition of two nos. is: " + (x+y));};


		// Subtraction a2 = (x,y)->{System.out.println("Subtraction of two nos. is: " + (x-y));};
		// Multiply a3 = (x,y)->{System.out.println("Multiplication of two nos. is: " + (x*y));};
		// Division a4 = (x,y)->{System.out.println("Division of two nos. is: " + (x/y));};
        a1.add(a,b);
        a1.defaultMethod();
        Addition.staticMethod();
        // a2.sub(a,b);
        // a2.defaultMethod();
        // Subtraction.staticMethod();
        // a3.mul(a,b);
        // a3.defaultMethod();
        // Multiply.staticMethod();
        // a4.divide(a,b);
        // a4.defaultMethod();
        // Division.staticMethod();
	}

}