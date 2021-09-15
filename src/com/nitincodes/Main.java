package com.nitincodes;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// java program to change the temperature from farhenhiet to celsius
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the temperature in farhenheit:");
        float farh = sc.nextInt();
        float celsius = (farh-32)*5/9;
        System.out.println("the temperature in celsius is " +celsius);

    }
}
