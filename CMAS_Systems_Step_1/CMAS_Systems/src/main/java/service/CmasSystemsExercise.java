package service;

import utils.NameEnum;

import java.util.stream.IntStream;

public class CmasSystemsExercise {
    public static void printSequence(int firstNumberOfRange, int secondNameOfRange) {
        IntStream.rangeClosed(firstNumberOfRange, secondNameOfRange).mapToObj(
                number -> number % 3 == 0 ? (number % 5 == 0 ? NameEnum.MULTIPLES_OF_FIFTEEN.label : NameEnum.MULTIPLES_OF_THREE.label) :
                          (number % 5 == 0 ? NameEnum.MULTIPLES_OF_FIVE.label : number + " ")).forEach(System.out::print);
    }
}
