package service;

import utils.NameEnum;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class CmasSystemsExercise {
    public static void printSequence(int firstNumberOfRange, int secondNameOfRange) {
        Predicate<Integer> integerPredicate = integer -> integer.toString().contains("3");

        IntStream.rangeClosed(firstNumberOfRange, secondNameOfRange).mapToObj(
                number -> integerPredicate.test(number) ? NameEnum.CONTAINS_A_THREE.label : number % 3 == 0 ?
                                                                                            (number % 5 == 0 ?
                                                                                             NameEnum.MULTIPLES_OF_FIFTEEN.label :
                                                                                             NameEnum.MULTIPLES_OF_THREE.label) :
                                                                                            (number % 5 == 0 ?
                                                                                             NameEnum.MULTIPLES_OF_FIVE.label :
                                                                                             number + " "))
                 .forEach(System.out::print);
    }
}
