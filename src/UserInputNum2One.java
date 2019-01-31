import java.util.Scanner;

public class UserInputNum2One {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number greater than one and less than 100");
        int num = keyboard.nextInt();
        // index is equal to USER INPUT when index is greater than or equal to 1 take away 1 from index and print
        for(int i = num ; i >= 1; --i ){
            System.out.println(i);
        }
    }
}
