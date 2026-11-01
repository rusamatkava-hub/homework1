package org.example;

public class Main {
    public static void main(String[] args) {


//N.1
        int productPrice = 150;
        if (productPrice >= 100) {
            System.out.println(productPrice - productPrice * 10 / 100);
        } else {
            System.out.println(productPrice);
        }


//N.2
        String userName = "Rusa";
        String password = "Test123";
        if (userName.equals("Rusa") && password.equals("Test123")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid username or password");
        }


//N.3
        int[] testResults = {1, 0, 1, 1, 0};
        for (int i = 0; i < testResults.length; i++) {

            if (testResults[i] == 1) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        }

//N.4
        String orderStatus = "PROCESSING";

        switch (orderStatus) {
            case "NEW":
                System.out.println("Order received");
                break;
            case "PROCESSING":
                System.out.println("Order is being prepared");
                break;
            case "SHIPPED":
                System.out.println("Order is on the way");
                break;
            case "DELIVERED":
                System.out.println("Order delivered");
                break;
            default:
                System.out.println("Unknown status");
        }


//N.5
        String word = "Banana";

        // ხმოვნების დათვლა
        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' ||
                    word.charAt(i) == 'i' || word.charAt(i) == 'o' ||
                    word.charAt(i) == 'u') {

                count++;
            }
        }

        System.out.println("ხმოვნების რაოდენობა: " + count);

        // სტრინგის სიგრძე
        int length = word.length();

        System.out.println("სტრინგის სიგრძე: " + length);

        // სტრინგის სიგრძე ლუწია თუ კენტი
        if (length % 2 == 0) {
            System.out.println("ლუწი");
        } else {
            System.out.println("კენტი");
        }


    }
}