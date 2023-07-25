import java.util.Scanner;
public class RiemannSum{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("This program outputs the area under the curve of the function y = x^2 over the domain x1 - x2\nEnter your values for x1 and x2:");
        System.out.println("x1: ");
        double x1 = input.nextDouble();
        System.out.println("x2: ");
        double x2 = input.nextDouble();
        System.out.println(xSquareArea(x1, x2));
    }

    public static double xSquareArea(double x1,double x2){
        double area = 0;
        double boxes = 1000000;
        double width = (x2-x1)/boxes;
        for (double i = x1; i <= x2; i+=width){
            area += (width * i * i);
        }
        return area;
    } 
}
