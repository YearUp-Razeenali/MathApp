package com.pluralsight;

import static java.lang.Math.random;

public class MathApp {
    public static void main(String[] args) {
        // Question 1:
        // declare variables here
        int Bob_salary = 100_000, Gary_salary = 90_000, highest_salary;
        // then code solution
        highest_salary = Math.max(Bob_salary, Gary_salary);
        // then use System.out.println() to display results
        System.out.println("The highest salary is $" + highest_salary);


        // Question 2:
        // declare variables here
        int car_price = 36_000, truck_price = 473_820, cheaper_price;
        // then code solution
        cheaper_price = Math.min(car_price, truck_price);
        // then use System.out.println() to display results
        System.out.println("The cheaper car is $" + cheaper_price);


        // Question 3:
        // declare variables here
        float area, radius = 7.25f;
        // then code solution
        area = (float) (Math.PI * Math.pow(radius, 2));
        // then use System.out.println() to display results
        System.out.println("The area of a circle with a radius of 7.25 is: " + area);


        // Question 4:
        // declare variables here
        double number = 5.0, square_root;
        // then code solution
        square_root = Math.sqrt(number);
        // then use System.out.println() to display results
        System.out.println("The square root of " + number + " is: " + square_root);


        // Question 5:
        // declare variables here
        double x1 = 5, x2 = 85, y1 = 10, y2 = 50, distance;
        // then code solution
        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        // then use System.out.println() to display results
        System.out.println("The distance between points (5,10) and (85,50) is: " + distance);


        // Question 6:
        // declare variables here
        float num = -3.8f, abs_num;
        // then code solution
        abs_num = (float) Math.abs(num);
        // then use System.out.println() to display results
        System.out.println("The absolute value of -3.8 is: " + abs_num);
        // ex: System.out.println("The answer is " + answer);

        // Question 7:
        // declare variables here
        double random_number;
        // then code solution
        random_number = Math.random();
        // then use System.out.println() to display results
        System.out.println("A random between 0 to 1 is: " + random_number);

    }


}
