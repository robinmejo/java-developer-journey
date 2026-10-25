/*
Exercise 16 of 60 — Determine Eligibility to Vote 🗳️
Write a Java program using if-else to check whether a person is eligible to vote.
Rule: A person aged 18 or older is eligible to vote.
*/

public class $16_VotingEligibility {
    public static void main(String[] args) {
        int age = 20;
        if(age>=18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not Eligible");
        }
        
    }
}