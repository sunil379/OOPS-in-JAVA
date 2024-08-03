package practical_4;
/*
Practical No. :- 4 
Q.4] A circle has a radius. Its area can be calculated. The area is a double number. Its perimeter can be 
calculated as 2pi. The perimeter is a double number. Given two circles one can find out which is large and 
which is small. Create two circles c1 and c2 with radius as 10 and 7 respectively. Calculate the area and 
perimeter of each. Compare two circles with each other and display which is large and which is small. 
*/
import java.util.*;
public class Practical_4 
{ 
    public static void main(String[] args) { 
        try (Scanner sc = new Scanner(System.in)) {
            Circle c1= new Circle(); 
            System.out.print("Enter the value of radius 1 : ");
            c1.r= sc.nextInt(); 
            c1.pi=3.14; 
            System.out.println("Area of circle 1 is: " + c1.getArea()); 
            System.out.println("Perimeter of circle 1 is: " + c1.getPerimeter()); 
            Circle c2= new Circle(); 
            System.out.print("Enter the value of radius 1 : ");
            c2.r= sc.nextInt(); 
            c2.pi=3.14; 
            System.out.println("Area of circle 2 is: " + c2.getArea()); 
            System.out.println("Perimeter of circle 2 is: " + c2.getPerimeter()); 
            if (c1.getArea()>c2.getArea()) 
                System.out.println("Circle c1 is Larger."); 
            else 
                System.out.println("Circle c2 is Larger.");
        } 
    } 
   } 
    class Circle { 
    public double r; 
    public double pi; 
    public double getArea(){ 
    double area=pi*r*r; 
    return area; 
    } 
    public double getPerimeter(){ 
    double perimeter=2*pi*r; 
    return perimeter; 
    } 
   }