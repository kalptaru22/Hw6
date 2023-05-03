public class Que_7 {
    /*
     Write a program to insert any temperature value in degree Fahrenheit and convert
     to degree Celsius ((F − 32) × 5/9 = 0°C).
     */
    public static void main(String[] args) {
        temp(60);
    }
    public static void temp(int f){
        double celsius=((f-32)*5/9);
        System.out.println("Celsius = " +celsius);

    }
}
