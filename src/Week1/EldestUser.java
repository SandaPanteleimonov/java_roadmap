package Week1;

import java.util.Scanner;

public class EldestUser {
    public static void main(String[] args) {
        System.out.println("Who is the eldest among not married users?.");
        String UserOneName, UserTwoName, UserThreeName;
        int UserOneAge, UserTwoAge, UserThreeAge;
        boolean isMarriedUserOne, isMarriedUserTwo, isMarriedUserThree;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Input name of first user: ");
        UserOneName = keyboard.next();
        System.out.println("Enter age of first user:");
        UserOneAge = keyboard.nextInt();
        System.out.print("Your marriage status (Type true for 'married' or false for 'not married': ");
        isMarriedUserOne = keyboard.nextBoolean();

        System.out.print("Input name of second user: ");
        UserTwoName = keyboard.next();
        System.out.println("Enter age of second user:");
        UserTwoAge = keyboard.nextInt();
        System.out.print("Your marriage status (Type true for 'married' or false for 'not married': ");
        isMarriedUserTwo = keyboard.nextBoolean();

        System.out.print("Input name of third user: ");
        UserThreeName = keyboard.next();
        System.out.println("Enter age of third user:");
        UserThreeAge = keyboard.nextInt();
        System.out.print("Your marriage status (Type true for 'married' or false for 'not married': ");
        isMarriedUserThree = keyboard.nextBoolean();

        if ((UserOneAge > UserTwoAge) && (UserOneAge > UserThreeAge)) {
            if (!isMarriedUserOne) {
                System.out.println("Congrats, " + UserOneName + ", you are the Eldest Person, which is not married!");
            } else if
            ((UserTwoAge > UserThreeAge) && (!isMarriedUserTwo))
                System.out.println("Congrats, " + UserTwoName + ", you are the Eldest Person, which is not married!");
            } else if
            ((UserThreeAge > UserTwoAge) && (!isMarriedUserThree))
                System.out.println("Congrats, " + UserThreeName + ", you are the Eldest Person, which is not married!");
    }
}



