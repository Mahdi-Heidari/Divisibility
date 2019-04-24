package divisibility;

import java.util.Scanner;

public class Divisibility {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer number:\t");
        int userNo = input.nextInt();
        System.out.println("");

        if (userNo % 5 == 0 && userNo % 6 == 0) {

            System.out.printf("Is %d divisible by 5 and 6? true"
                    + "\nIs %d divisible by 5 or 6? true"
                    + "\nIs %d divisible by 5 or 6, but not both? false", userNo, userNo, userNo);
        } else if (userNo % 5 == 0 || userNo % 6 == 0) {

            System.out.printf("Is %d divisible by 5 and 6? false"
                    + "\nIs %d divisible by 5 or 6? true"
                    + "\nIs %d divisible by 5 or 6, but not both? true", userNo, userNo, userNo);

        } else {

            System.out.printf("Is %d divisible by 5 and 6? false"
                    + "\nIs %d divisible by 5 or 6? false"
                    + "\nIs %d divisible by 5 or 6, but not both? false", userNo, userNo, userNo);

        }

        System.out.println("\n\n\n");
    }

}
