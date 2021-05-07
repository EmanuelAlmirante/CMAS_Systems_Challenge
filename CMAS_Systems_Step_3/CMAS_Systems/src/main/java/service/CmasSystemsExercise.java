package service;

import org.apache.commons.lang3.math.NumberUtils;
import utils.NameEnum;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CmasSystemsExercise {
    public static void printSequence(int firstNumberOfRange, int secondNameOfRange) {
        Map<String, Integer> report = initializeMapWithKeysAndValues();

        Predicate<Integer> integerPredicate = integer -> integer.toString().contains("3");

        Consumer<Object> objectConsumer = object -> {
            String parsedObjectToString = object.toString();

            String key = !NumberUtils.isParsable(parsedObjectToString.strip()) ?
                         parsedObjectToString.strip() :
                         NameEnum.IS_A_INTEGER.label.strip();

            report.put(key, report.get(key) + 1);

            System.out.print(parsedObjectToString);
        };

        IntStream.rangeClosed(firstNumberOfRange, secondNameOfRange).mapToObj(
                number -> integerPredicate.test(number) ? NameEnum.CONTAINS_A_THREE.label : number % 3 == 0 ?
                                                                                            (number % 5 == 0 ?
                                                                                             NameEnum.MULTIPLES_OF_FIFTEEN.label :
                                                                                             NameEnum.MULTIPLES_OF_THREE.label) :
                                                                                            (number % 5 == 0 ?
                                                                                             NameEnum.MULTIPLES_OF_FIVE.label :
                                                                                             number + " "))
                 .forEach(objectConsumer);

        printReport(report);
    }

    private static LinkedHashMap<String, Integer> initializeMapWithKeysAndValues() {
        LinkedHashMap<String, Integer> report = new LinkedHashMap<>();

        report.put(NameEnum.MULTIPLES_OF_THREE.label.strip(), 0);
        report.put(NameEnum.MULTIPLES_OF_FIVE.label.strip(), 0);
        report.put(NameEnum.MULTIPLES_OF_FIFTEEN.label.strip(), 0);
        report.put(NameEnum.CONTAINS_A_THREE.label.strip(), 0);
        report.put(NameEnum.IS_A_INTEGER.label.strip(), 0);

        return report;
    }

    private static void printReport(Map<String, Integer> report) {
        Map<String, Integer> filteredReport = report.entrySet()
                                                    .stream()
                                                    .filter(stringIntegerEntry -> stringIntegerEntry.getValue() > 0)
                                                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        if (!filteredReport.isEmpty()) {
            System.out.println("\n");
            report.forEach((key, value) -> System.out.println(key + " " + value));
        }
    }
}
