/*
Problem: Convert a total number of seconds into hours, minutes and remaining seconds.
For example, if the input is 3665 seconds, the expected output is:
Hours: 1
Minutes: 1
Seconds: 5

*/

public class $5_Conversion {
    public static void main(String[] args) {
        int seconds=3665;
        int hours,minutes;
        hours=seconds/3600;
        minutes=(seconds-hours*3600)/60;
        seconds=seconds-(hours*3600+minutes*60);
        System.out.println("hours is "+hours+" minutes is "+minutes+" Seconds is "+seconds);
    }
}


/*
Alternative 

int hours = seconds / 3600;
int minutes = (seconds % 3600) / 60;
int remainingSeconds = seconds % 60;
*/