//sum and average of N numbers entered by the users

import java.util.Scanner;
public class SumAverageOf_N_num {
    public static void main(String[] args) {
        int number, total, sum=0;
        double average;
        Scanner input = new Scanner(System.in);
        System.out.print("How much numbers do you want to calculate Sum and Average: ");
        total = input.nextInt();
        for (int i = 1; i<=total; i ++)
        {
            if( i == 1)
            {
              System.out.print("Enter the "+i+"st number : ");  
               number = input.nextInt();
            }
            else if( i == 2)
            {
              System.out.print("Enter the "+i+"nd number : "); 
               number = input.nextInt(); 
            }
            else if( i == 3)
            {
              System.out.print("Enter the "+i+"rd number : ");  
               number = input.nextInt();
            }
            else {
                System.out.print("Enter the "+i+"th number: ");
                number = input.nextInt();
            }
            sum +=number;
        }
        average=sum/total;
        System.out.println("The sum of the given numbers is: "+ sum);
        System.out.println("The average of the given numbers is: "+ average);
    }
}
