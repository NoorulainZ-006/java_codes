
import java.util.Scanner;

public class Dog {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        theDog dog1 = new theDog();
        System.out.println("Enter the inpormation of your dog......");
        System.out.print("Name: ");
        dog1.name = input.nextLine();
        System.out.print("Breed: ");
        dog1.breed = input.nextLine();
        System.out.print("Age: ");
        dog1.age = input.nextInt();
        System.out.println(input.nextLine());
        theDog dog2 = new theDog();
        System.out.println("Enter the inpormation of your dog......");
        System.out.print("Name: ");
        dog2.name = input.nextLine();
        System.out.print("Breed: ");
        dog2.breed = input.nextLine();
        System.out.print("Age: ");
        dog2.age = input.nextInt();

        dog1.bark();
        dog2.bark();

        input.close();
    }
}
class theDog {
   
    String name;
    String breed;
    int age;
    public void bark() {
        System.out.println("The Dog "+name + " barks loudly! Woof");
    }
}

