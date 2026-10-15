/*
Write a Java program to compute the percentage obtained from marks.
For this exercise, assume five subjects, each out of 100 marks.
*/

public class $10_ComputePercentage {
    public static void main(String[] args) {
        int totalMarks = 425;
        int totalPossibleMarks = 500;

        double percentage=((double)totalMarks/totalPossibleMarks)*100;
        System.out.println("Percentage: " + percentage + "%");
    }
}

/*
🧠 Remember this for interviews
- (double) (a / b) — division happens first.
- (double) a / b — conversion happens before division.
*/