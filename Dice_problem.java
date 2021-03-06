
package dice_problem;
import java.util.Random;                       // importing Random class package


public class Dice_problem {

   public static void main(String[] args) {
       
       roll obj=new roll();                    // roll class object is needed to call dice_roll method       
       obj.dice_roll();                        // calling dice_roll method

    }
  
}



class roll
{
   public  void dice_roll()                        // dice_roll method
   {
        int i;                                     // local variables
        int sum=0;
        
        Random x=new Random();                     // Random class object
       
        for(i=1;i<=5;i++)                          // for loop iteration for 5 dice
        {
             int y = x.nextInt(6);
             System.out.println("Dice " +i+ " outcome = "+y);
             sum=sum+y;
        }
        
        System.out.println("sum of all Dice outcomes = " + sum);
   }
}
