public class Que_11 {
    /*
    11. Write a Java program to compute the specified expressions and print the output.
    Test Data:
                ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
    Expected Output: 2.138888888888889
 */

        static double a=25.5;
        static double b=3.5;
        static double c=40.5;
        static double d=4.5;

        public static void cal(){
            double e=((a*b-b*b)/(c-d));
            System.out.println(e);
        }

    public static void main(String[] args) {
        Que_11 r =new Que_11();
        r.cal();
    }





}
