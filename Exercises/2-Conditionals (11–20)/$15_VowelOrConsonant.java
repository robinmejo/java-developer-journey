/*
Exercise 15 of 60 — Check Whether a Character Is a Vowel 🔤
Write a Java program using if-else to determine whether a character is a vowel or a consonant.
Rules:
- Vowels: a, e, i, o, u (both lowercase and uppercase).
- Other alphabetic characters are consonants.
 */
public class $15_VowelOrConsonant {
    public static void main(String[] args) {
        char ch = '@';
        ch=Character.toLowerCase(ch);
        if(!Character.isLetter(ch)){
            System.out.println("Not an Alphabet");
        }
        else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("Vowels");
        }
        else{
            System.out.println("Consonants");
        }
        
    }
}
