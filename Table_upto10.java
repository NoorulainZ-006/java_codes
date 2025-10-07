//Table of any number upto 10

import java.util.Scanner;
public class Table_upto10 {
    public static void main(String[] args){
    int num, result;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    num =input.nextInt();
    System.out.println("The table of "+ num);
    for (int i = 1; i <= 10; i++) {
        result= num* i;
        System.out.println(num+" * "+ i +" = " + result);
    }
}
}