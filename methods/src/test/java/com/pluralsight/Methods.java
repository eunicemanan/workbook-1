package com.pluralsight;

public class Methods {
    public static void main(String[] args) {

        brushTeeth(); //
        String favoriteMovieResult = favoriteMovie(); // catching the return
        System.out.println("My favorite movie is:" + favoriteMovieResult);
        int sum = addingTwoNumbers(400, 600);
        System.out.println(sum);

    }

    public static void brushTeeth() {
        System.out.println("How To Brush Your Teeth:");
        System.out.println(" ");
        System.out.println("Grab your tooth brush,");
        System.out.println("Grab your toothpaste, and apply toothpaste to the toothbrush");
        System.out.println("Place toothbrush inside your mouth, and start brushing your teeth in circular motions");
        System.out.println(" ");
    }

    public static String favoriteMovie() {
        return "Shrek";
    }

    public static int addingTwoNumbers(int a, int b) {
        int sum = a + b;
        return sum;


    }




}


