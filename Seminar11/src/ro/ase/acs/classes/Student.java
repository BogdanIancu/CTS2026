package ro.ase.acs.classes;

public class Student {
    private static final int MIN_GRADE = 1;
    private static final int MAX_GRADE = 10;
    private static final int MAX_NUMBER_OF_GRADES = 12;
    private String name;
    private int age;
    private int[] grades;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getGrades() {
        if(grades != null) {
            return grades.clone();
        }
        return null;
    }

    public void setGrades(int[] grades) {
        if(grades != null) {
            this.grades = grades.clone();
        }
        else {
            this.grades = null;
        }
    }

    public double computeAverage() {
        if(grades == null || grades.length == 0) {
            return MIN_GRADE;
        }
        if(grades.length > MAX_NUMBER_OF_GRADES) {
            throw new IllegalArgumentException("The maximum number of grades exceeded");
        }

        double sum = 0;
        for(int i = 0;  i < grades.length; i++) {
            sum += grades[i];
        }

        double average = sum / grades.length;
        double truncatedAverage = Math.floor(average * 100) / 100;

        if(truncatedAverage < MIN_GRADE) {
            return MIN_GRADE;
        } else if(truncatedAverage > MAX_GRADE) {
            return MAX_GRADE;
        } else {
            return truncatedAverage;
        }
    }
}
