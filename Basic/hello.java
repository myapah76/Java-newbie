package Basic;
import java.util.Scanner;

public class hello{
    public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("what is your name");
            String name = scanner.nextLine();
            System.out.println("how old are you?");
            int age = scanner.nextInt();
            scanner.nextLine(); 
            //clear the input, cause .nextInt only read the number such as 18\n
            // and \n will be read by .nextline which is why we cannot input any variables after
            System.out.println("how was your day?");
            String answer = scanner.nextLine();

            System.out.println("Okay, hello " + name);
            System.out.println("you are " + age + " years old");
            System.out.println("and your day was "+ answer);
            System.out.println("=======================");
            System.out.println("let's give me 2 integer numbers to do simple math :");

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            scanner.nextLine();
            System.out.println("This is some simple math : +  -  *  /");
            System.out.println( a + b );
            System.out.println(a - b );
            System.out.println( a *  b );
            System.out.println( a  / b );
            System.out.println("=======================");
            
            System.out.println("this is some if else statement");

            if (a  > b) {
                System.out.println("beacause a > b so this statement can be seen");
            }else{
                System.out.println("beacause a < b so this statement can be seen");
            }
            System.out.println("adsadas");
        }
        }
            


    }

