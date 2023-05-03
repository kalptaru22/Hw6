public class Que_13 {
    /*
    13. Write a Java program to print the area and perimeter of a rectangle.
    Test Data:
    Width = 5.5 Height = 8.5
    Expected Output:
    Area is 5.6 * 8.5 = 47.60
    Perimeter is 2 * (5.6 + 8.5) = 28.20
     */

    static double w=5.6;
    static double h=8.5;

    public static void ar(){
        double area=(w*h);
        double perimeter=(2*(w+h));
        System.out.println("AREA = "+area);
        System.out.println("PERIMETER = "+perimeter);
    }

    public static void main(String[] args) {
        Que_13 ans= new Que_13();
        ans.ar();
    }

}
