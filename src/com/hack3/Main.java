package com.hack3;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new File ("main.in"));

        String timePositiveCheckedIn = in.next();
        String timeYouWereThere = in.next();
        String location = in.next();

        in.close();

        String result = "";
        int timePositiveCheckedInInteger = toMinutes(timePositiveCheckedIn);
        int timeYouWereThereInteger = toMinutes(timeYouWereThere);

        if (timePositiveCheckedInInteger == timeYouWereThereInteger) {
            result = "You are in danger of catching COVID-19. You were at " + location + " at the same time as someone " +
                    "who tested positive for the virus. For your information, the time was " + timeYouWereThere + ". " +
                    "Please seek help immediately. If this is not possible, please self-quarantine.";
        }


        PrintWriter out = new PrintWriter(new File("main.out"));
        System.out.println(result);
        out.close();
    }

    private static int toMinutes(String s) {
        String[] hourMin = s.split(":");
        int hour = Integer.parseInt(hourMin[0]);
        int mins = Integer.parseInt(hourMin[1]);
        int hoursInMins = hour * 60;
        int totalMins = hoursInMins + mins;
        return totalMins;
    }
}
