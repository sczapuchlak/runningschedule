package com.stephanie;
import java.util.Scanner;
public class Main {
    static Scanner stringScanner = new Scanner(System.in);
    static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write while loops
        double distance = 1;
        double TargetDistance = 26.2;
        double increment = 1.1;
        double weeksIn = 1;

        while(distance < TargetDistance){
           distance = distance*increment;
            weeksIn ++;
            System.out.println("your run distance on week " + weeksIn+ " is "+
            distance);


        }
    }
}
