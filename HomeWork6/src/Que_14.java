public class Que_14 {
    /*Write a Java program to print the sum (addition), multiply, subtract, divide and
     remainder of two numbers.
     */
    public static void main(String[] args) {
        addition(125,24);
        subtraction(125,24);
        Que_14 p= new Que_14();
        p.multiplication(125,24);
        p.division(125,24);
        remainder(125,24);

    }
    public static void addition(int a,int b) {
        System.out.println("Addition = " +(a+b));
    }
    public static void subtraction(int a,int b){

        System.out.println("substraction = "+(a-b));
    }
    public  void multiplication(int a, int b){

        System.out.println("Multiplication = "+(a*b));
    }
    public void division (int a, int b) {
        System.out.println("Division = " + (a/b));
    }
    public static void remainder(int a,int b){
        System.out.println("Remainder = "+(a%b));
        }
}
