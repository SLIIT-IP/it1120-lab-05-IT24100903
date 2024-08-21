import java.util.Scanner;

public class IT24100903Lab5Q1
{
    public static void main(String[]args)
    {

      Scanner input=new Scanner(System.in);
     
      int num1,num2,num3;
      int max;
      int min;

      System.out.print("Enter the first integer: ");
      num1=input.nextInt();

      System.out.print("Enter the second integer: ");
      num2=input.nextInt();

      System.out.print("Enter the third integer: ");
      num3=input.nextInt();

      System.out.println("User entered numbers are : "+num1+" "+num2+" "+num3);
      
      max=(num1>num2)?((num1>num3)?(num1):(num3)):((num2>num3)?(num2):(num3));
      min=(num1<num2)?((num1<num3)?(num1):(num3)):((num2<num3)?(num2):(num3));
      

     System.out.println("The Smallest number is: "+min);
     System.out.println("The Largest number is: "+max);
     }
}
      