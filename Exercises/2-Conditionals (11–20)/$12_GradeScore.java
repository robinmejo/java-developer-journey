
/*
Exercise 12 of 60 — Grade a Score into A/B/C/D/F 📊
Write a Java program to assign a grade based on the student's score using if-else if-else.

Rules:
Score	Grade
90–100	A
80–89	B
70–79	C
60–69	D
Below60	F
*/
public class $12_GradeScore {
    public static void main(String[] args) {
        int score = 85;
        if (score <= 100 && score >= 0) {
            if (score >= 90) {
                System.out.println("Grade A");
            } else if (score >= 80) {
                System.out.println("Grade B");
            } else if (score >= 70) {
                System.out.println("Grade C");
            } else if (score >= 60) {
                System.out.println("Grade D");
            } else if (score < 60) {
                System.out.println("Grade F");
            }

        } else {
            System.out.println("Invalid score");
        }

    }
}