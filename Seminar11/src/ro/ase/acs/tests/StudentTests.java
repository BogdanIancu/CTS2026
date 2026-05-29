package ro.ase.acs.tests;

import org.junit.jupiter.api.*;
import ro.ase.acs.classes.Student;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class StudentTests {
    private Student student;

    @BeforeEach
    public void initializeStudent() {
        student = new Student();
    }

    @AfterEach
    public void resetStudent() {
        student = null;
    }

    @Test
    public void givenStudentWhenDefaultConstructorIsCalledThenGradesShouldBeNull() {
        // Arrange
        Student student;
        // Act
        student = new Student();
        // Assert
        Assertions.assertNull(student.getGrades(), "The grades is not null for a default student");
    }

    @Test
    public void averageConformanceTest() {
        student.setGrades(new int[] {9, 10, 10});
        double average = student.computeAverage();

        Assertions.assertEquals(9.66, average, 0.009, "The average is not conform");
    }

    @Test
    public void averageOrderingTest() {
        student.setGrades(new int[] {9, 6, 7, 10, 10, 5});
        Student student2 = new Student();
        student2.setGrades(new int[] {5, 6, 7, 9, 10, 10});
        double average1 = student.computeAverage();
        double average2 = student2.computeAverage();

        Assertions.assertEquals(average1, average2, 0.009, "The order of grades influences the average");
    }

    @Test
    public void averageRangeMinTest() {
        student.setGrades(new int[] {0, 0, 1});
        double average = student.computeAverage();

        Assertions.assertEquals(1, average, 0.009, "The min average is not 1");
    }

    @Test
    public void averageRangeMaxTest() {
        student.setGrades(new int[] {10, 10, 11});
        double average = student.computeAverage();

        Assertions.assertEquals(10, average, 0.009, "The max average is not 10");
    }

    @Test
    public void averageReferenceTest() {
        student.setGrades(null);
        double average = student.computeAverage();

        Assertions.assertEquals(1, average, 0.009, "The average is not 1 for null grades array");
    }

    @Test
    public void averageExistenceTest() {
        student.setGrades(new int[]{});
        double average = student.computeAverage();

        Assertions.assertEquals(1, average, 0.009, "The average is not 1 for null grades array");
    }

    @Test
    public void averageCardinality1Test() {
        student.setGrades(new int[] { 9 });
        double average = student.computeAverage();

        Assertions.assertEquals(9, average, 0.009, "The average for on grade should be the grade");
    }

    @Test
    public void averageCardinalityNTest() {
        student.setGrades(new int[14]);

        Assertions.assertThrows(IllegalArgumentException.class, () -> student.computeAverage(),
                "The average for too many grades is still computed");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.MILLISECONDS)
    public void averageTimeTest() {
        int[] grades = new int[12];
        Arrays.fill(grades, 10);
        student.setGrades(grades);
        student.computeAverage();
    }
}
