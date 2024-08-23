import java.util.Scanner;

public class IT24100903Lab5Q3
{
   public static void main(String[]args)
    {
      Scanner input=new Scanner(System.in);
     
      final double ROOM_CHARGE=48000;
      int start_date,end_date,num_of_days,discount;
      double total;
           
      System.out.print("Enter Start Date (1-31): ");
      start_date=input.nextInt();

      System.out.print("Enter End Date (1-31): ");
      end_date=input.nextInt();

       System.out.println("  ");
     

      if(start_date>0 && end_date<32)
      {
         if(start_date<end_date)
         {
            num_of_days=end_date-start_date;
            switch(num_of_days)
            {
               case 1:
               total=num_of_days*ROOM_CHARGE;
               System.out.println("Room Charge Per Day: Rs. "+ROOM_CHARGE+"/=");
               System.out.println("Number of days Reserved: "+num_of_days);
               System.out.println("Total Amount to be Paid: "+total);
               break;

               case 2:
               total=num_of_days*ROOM_CHARGE;
               System.out.println("Room Charge Per Day: Rs. "+ROOM_CHARGE+"/=");
               System.out.println("Number of days Reserved: "+num_of_days);
               System.out.println("Total Amount to be Paid: "+total);
               break;
  
               case 3:
               total=((num_of_days*ROOM_CHARGE)*90/100);
               System.out.println("Room Charge Per Day: Rs. "+ROOM_CHARGE+"/=");
               System.out.println("Number of days Reserved: "+num_of_days);
               System.out.println("Total Amount to be Paid: "+total);
               break;

               case 4:
               total=((num_of_days*ROOM_CHARGE)*90/100);
               System.out.println("Room Charge Per Day: Rs. "+ROOM_CHARGE+"/=");
               System.out.println("Number of days Reserved: "+num_of_days);
               System.out.println("Total Amount to be Paid: "+total);
               break;

               default:
               total=((num_of_days*ROOM_CHARGE)*80/100);
               System.out.println("Room Charge Per Day: Rs. "+ROOM_CHARGE+"/=");
               System.out.println("Number of days Reserved: "+num_of_days);
               System.out.println("Total Amount to be Paid: "+total);
               break;

               
            }
         }
         else
         {
            System.out.print("Error: Start date must be less than End date");
         }
         
      }
      else
      { 
         System.out.print("Error: Days must be between 1 and 31");           
      }
   }
}


      
      
      
      
 