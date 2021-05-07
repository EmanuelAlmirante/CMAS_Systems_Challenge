import service.CmasSystemsExercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int firstNumberOfRange;
        System.out.print("Introduce the first number of the range: ");
        firstNumberOfRange = in.nextInt();

        int secondNumberOfRange;
        System.out.print("Introduce the second number of the range (greater than the first one): ");
        secondNumberOfRange = in.nextInt();

        CmasSystemsExercise.printSequence(firstNumberOfRange, secondNumberOfRange);
    }
}
