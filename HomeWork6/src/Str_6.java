public class Str_6 {
    /*Write a java program which replace a “I@love@java” to “we love java”
Expected output: We love java

     */

    public static void main(String[] args) {
        String x="I@love@java";
        System.out.println(x.replaceAll("@"," "));
    }
}
