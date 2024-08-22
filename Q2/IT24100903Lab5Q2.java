import java.util.Scanner;


public class IT24100903Lab5Q2
{
    public static void main(String[]args)
     {
      Scanner input=new Scanner (System.in);

      int newmembers, noprize, pen, umbrella, bag, travelchair, headphone;

      System.out.print("Enter the number of new members introduced: ");
      newmembers=input.nextInt();
      
      if(newmembers>=0)
      {
           switch (newmembers)
           {
            case 0:
            System.out.println("No Prize ");
            break;

            case 1:
            System.out.println("Prize is a : Pen"); 
            break;

            case 2:
            System.out.println("Prize is a : Umbrella");
            break;

            case 3:
            System.out.println("Prize is a : Bag");
            break; 

            case 4:
            System.out.println("Prize is a : Travelling Chair ");
            break; 

            default:
            System. out.println("Prize is a : Headphone ");
            break;
           }
      }      
      else
            {
            System.out.print("Input must be a number 0 or greater");
            }

      }
}