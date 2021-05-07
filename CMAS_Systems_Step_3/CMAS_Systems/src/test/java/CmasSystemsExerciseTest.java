import org.junit.jupiter.api.Test;
import service.CmasSystemsExercise;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CmasSystemsExerciseTest {
    @Test
    public void zeroAsFirstNumberOfRangeSmallerThanPositiveSecondNumberOfRangePrintsCorrectSequence() {
        // Arrange
        int firstNumberOfRange = 0;
        int secondNumberOfRange = 20;
        String result = null;

        // Act
        try {
            result = tapSystemOut(() -> CmasSystemsExercise.printSequence(firstNumberOfRange, secondNumberOfRange));
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        // Assert
        assertEquals("CMASsystems "
                     + "1 "
                     + "2 "
                     + "good "
                     + "4 "
                     + "systems "
                     + "CMAS "
                     + "7 "
                     + "8 "
                     + "CMAS "
                     + "systems "
                     + "11 "
                     + "CMAS "
                     + "good "
                     + "14 "
                     + "CMASsystems "
                     + "16 "
                     + "17 "
                     + "CMAS "
                     + "19 "
                     + "systems \n"
                     + "\n"
                     + "CMAS 4\n"
                     + "systems 3\n"
                     + "CMASsystems 2\n"
                     + "good 2\n"
                     + "Integer 10\n", result);
    }

    @Test
    public void negativeFirstNumberOfRangeSmallerThanZeroAsSecondNumberOfRangePrintsCorrectSequence() {
        // Arrange
        int firstNumberOfRange = -20;
        int secondNumberOfRange = 0;
        String result = null;

        // Act
        try {
            result = tapSystemOut(() -> CmasSystemsExercise.printSequence(firstNumberOfRange, secondNumberOfRange));
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        // Assert
        assertEquals("systems "
                     + "-19 "
                     + "CMAS "
                     + "-17 "
                     + "-16 "
                     + "CMASsystems "
                     + "-14 "
                     + "good "
                     + "CMAS "
                     + "-11 "
                     + "systems "
                     + "CMAS "
                     + "-8 "
                     + "-7 "
                     + "CMAS "
                     + "systems "
                     + "-4 "
                     + "good "
                     + "-2 "
                     + "-1 "
                     + "CMASsystems \n"
                     + "\n"
                     + "CMAS 4\n"
                     + "systems 3\n"
                     + "CMASsystems 2\n"
                     + "good 2\n"
                     + "Integer 10\n", result);
    }

    @Test
    public void positiveFirstNumberOfRangeSmallerThanPositiveSecondNumberOfRangePrintsCorrectSequence() {
        // Arrange
        int firstNumberOfRange = 1;
        int secondNumberOfRange = 20;
        String result = null;

        // Act
        try {
            result = tapSystemOut(() -> CmasSystemsExercise.printSequence(firstNumberOfRange, secondNumberOfRange));
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        // Assert
        assertEquals("1 "
                     + "2 "
                     + "good "
                     + "4 "
                     + "systems "
                     + "CMAS "
                     + "7 "
                     + "8 "
                     + "CMAS "
                     + "systems "
                     + "11 "
                     + "CMAS "
                     + "good "
                     + "14 "
                     + "CMASsystems "
                     + "16 "
                     + "17 "
                     + "CMAS "
                     + "19 "
                     + "systems \n"
                     + "\n"
                     + "CMAS 4\n"
                     + "systems 3\n"
                     + "CMASsystems 1\n"
                     + "good 2\n"
                     + "Integer 10\n", result);
    }

    @Test
    public void negativeFirstNumberOfRangeSmallerThanNegativeSecondNumberOfRangePrintsCorrectSequence() {
        // Arrange
        int firstNumberOfRange = -20;
        int secondNumberOfRange = -1;
        String result = null;

        // Act
        try {
            result = tapSystemOut(() -> CmasSystemsExercise.printSequence(firstNumberOfRange, secondNumberOfRange));
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        // Assert
        assertEquals("systems "
                     + "-19 "
                     + "CMAS "
                     + "-17 "
                     + "-16 "
                     + "CMASsystems "
                     + "-14 "
                     + "good "
                     + "CMAS "
                     + "-11 "
                     + "systems "
                     + "CMAS "
                     + "-8 "
                     + "-7 "
                     + "CMAS "
                     + "systems "
                     + "-4 "
                     + "good "
                     + "-2 "
                     + "-1 \n"
                     + "\n"
                     + "CMAS 4\n"
                     + "systems 3\n"
                     + "CMASsystems 1\n"
                     + "good 2\n"
                     + "Integer 10\n", result);
    }

    @Test
    public void positiveFirstNumberOfRangeGreaterThanPositiveSecondNumberOfRangePrintsEmptySequence() {
        // Arrange
        int firstNumberOfRange = 20;
        int secondNumberOfRange = 1;
        String result = null;

        // Act
        try {
            result = tapSystemOut(() -> CmasSystemsExercise.printSequence(firstNumberOfRange, secondNumberOfRange));
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        // Assert
        assertEquals("", result);
    }

    @Test
    public void negativeFirstNumberOfRangeGreaterThanNegativeSecondNumberOfRangePrintsEmptySequence() {
        // Arrange
        int firstNumberOfRange = -1;
        int secondNumberOfRange = -20;
        String result = null;

        // Act
        try {
            result = tapSystemOut(() -> CmasSystemsExercise.printSequence(firstNumberOfRange, secondNumberOfRange));
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        // Assert
        assertEquals("", result);
    }
}
