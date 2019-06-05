package maspa;

import java.util.Scanner; 
public class Calculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        double result;

        System.out.println("Welcome to the MASPA Calculator!");
        System.out.println("Choose an operation to calculate: ");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Exponential Math");
        System.out.println("6: Square Root");
        System.out.println("7: Sine of an Angle");
        System.out.println("8: Cosine of an Angle");
        System.out.println("9: Tangent of an Angle");
        double var = input.nextDouble();
        
        System.out.print("Please enter the first number or base number: \n");
        a = input.nextDouble();
        System.out.print("Please enter the second number or the exponent (if using square root, enter 0):  \n");
        b = input.nextDouble();
      
        if (var == 1) {
        	result = a + b;  
        	System.out.println(a + " + " + b + " = " + result);  }
        else if (var == 2)  {
        	result = a - b;  
        	System.out.println(a + " - " + b + " = " + result);	}
        else if (var == 3)	{
        	result = a * b;   
        	System.out.println(a + " * " + b + " = " + result);	}
        else if (var == 4)   {
        	result = a / b;  
        	System.out.println(a + " / " + b + " = " + result);	}
        else if (var ==5) {
        	result = Math.pow(a, b);
        	System.out.println(a + " ^ " + b + " = " + result); }
        else if (var == 6) {
        	result = Math.sqrt(a);
        	System.out.println("sqrt of " + a + " = " + result); }
        else if (var == 7) {
        	result = Math.sin(a);
        	System.out.println("Sine of " + a  + " = " + result); }
        else if (var == 8) {
        	result = Math.cos(a);
        	System.out.println("Cosine of " + a + " = " + result); }
        else if (var == 9) {
        	result = Math.tan(a);
        	System.out.println("Tangent of " + a + " = " + result); }
    }
}
