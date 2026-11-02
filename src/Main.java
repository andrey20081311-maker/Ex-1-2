import java.util.Scanner;
public class Main
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        // homework 1
//        Scanner scanner = new Scanner(System.in);
//        double bruto;
//        double answer;
//        System.out.println("Enter gross monthly pay:");
//        bruto = scanner.nextInt();
//        scanner.nextLine();
//        answer = bruto;
//        // הפרשות לפנסיה
//        answer = answer - bruto  * 0.06;
//        // דמי ביטוח לאומי
//        answer = answer - (Math.min(bruto, 7703) * 0.0427);
//        // דמי ביטוח בריאות
//        answer = answer - Math.max(0,Math.min(bruto, 51910) - 7703) * 0.1217;
//        //הפרשות לקרן השתלמות
//        answer = answer - Math.min(bruto * 0.025, 392.8);
//        // מס הכנסה
//        answer = answer - (Math.min(bruto, 7010) * 0.10)
//                + (Math.max(0, Math.min(bruto, 10060) - 7010) * 0.14)
//                + (Math.max(0, Math.min(bruto, 19000) - 10060)  * 0.20)
//                + (Math.max(0, Math.min(bruto, 25100) - 19000)  * 0.31)
//                + (Math.max(0, Math.min(bruto, 46690) - 25100)  * 0.35)
//                + (Math.max(0, Math.min(bruto, 60130) - 46690)  * 0.47)
//                + (Math.max(0, bruto - 60130) * 0.50);
//        System.out.println("Your check after taxes is: " + answer);

        //-----------------------------------------------------//

        // homework 2
        System.out.print("Enter exercise number (1-10): ");
        int exercise = scanner.nextInt();
        scanner.nextLine();

        if (exercise == 1) {
            digitalID();
        } else if (exercise == 2) {
            timeConverter();
        } else if (exercise == 3) {
            restaurantBill();
        } else if (exercise == 4) {
            computerStore();
        } else if (exercise == 5) {
            distanceCalculator();
        } else if (exercise == 6) {
            finaleGrade();
        } else if (exercise == 7) {
            checkingNumbers();
        } else if (exercise == 8) {
            ticketPricingSystem();
        } else if (exercise == 9) {
            wordInfo();
        } else if (exercise == 10) {
            f10();
        } else System.out.print("Invalid input. please try again");
    }

    // ask the user to enter his name, age, height and last name initial prints them all and calculates his age in 10 years
    public static void digitalID() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your height: ");
        double height = scanner.nextDouble();

        System.out.print("Enter your last name initial: ");
        char lastNameInitial = scanner.next().charAt(0);

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Last name initial: " + lastNameInitial);
        System.out.println("Age in 10 years: " + (age + 10));
    }

    // turns a big number that the user enters into hours minutes and seconds
    public static void timeConverter() {
        System.out.print("Enter a number and ill turn it into time! ");
        int time = scanner.nextInt();

        System.out.println("Hours: " + (time / 3600));
        System.out.println("Minutes: " + ((time % 3600) / 60));
        System.out.println("Seconds: " + (time % 60));
    }

    // gets the bill amount, tip percentage and amount of people and it calculates the total tip total bill and how much each person needs to pay
    public static void restaurantBill() {
        System.out.print("Bill: ");
        double bill = scanner.nextDouble();

        System.out.print("Tip percentage: ");
        int tip = scanner.nextInt();

        System.out.print("People: ");
        int people = scanner.nextInt();

        System.out.println("Tip: " + ((tip * 0.01) * bill));
        System.out.println("Total: " + ((tip * 0.01) * bill + bill));
        System.out.println("Per person: " + (((tip * 0.01) * bill + bill) / people));
    }

    // the user enters how many of each item he want to buy their prices and the discount percentage and it print the price before and after the discount and the amount of the discount
    public static void computerStore() {
        double computers, computersPrice, laptops, laptopsPrice,  phones, phonePrice, sum;
        System.out.print("How many computers did the customer buy? ");
        computers = scanner.nextInt();
        System.out.print("whats the computers price? ");
        computersPrice = scanner.nextDouble();
        System.out.print("How many laptops did the customer buy? ");
        laptops = scanner.nextInt();
        System.out.print("whats the laptops price? ");
        laptopsPrice = scanner.nextDouble();
        System.out.print("How many phones did the customer buy? ");
        phones = scanner.nextInt();
        System.out.print("whats the phones price? ");
        phonePrice = scanner.nextDouble();
        sum = (computers * computersPrice)+ (laptops * laptopsPrice) + (phones * phonePrice);
        System.out.print("whats the discount percentage? ");
        double discount = scanner.nextDouble();
        discount = discount * 0.01;

        System.out.println("Price before discount: " + sum);
        System.out.println("Discount amount: " + (discount * sum));
        System.out.println("Price after discount: " + (sum - (sum * discount)));

    }

    public static void distanceCalculator() {
        System.out.print("Distance: ");
        int distance = scanner.nextInt();

        System.out.print("Time in minutes: ");
        int time = scanner.nextInt();

        System.out.println("Time in hours: " + (time / 60.0));
        System.out.println("Average speed: " + (distance / (time / 60.0)) + "km/h");
        System.out.println("Distance in one hour: " + (distance / (time / 60.0)));
    }

    public static void finaleGrade() {
        System.out.print("Assignments: ");
        double assignments = scanner.nextDouble();

        System.out.print("Quiz: ");
        double quiz = scanner.nextDouble();

        System.out.print("Final exam: ");
        double finaleExam = scanner.nextDouble();

        System.out.println("Final grade: " + ((assignments * 0.2) + (quiz * 0.3) + (finaleExam * 0.5)));
        System.out.print("Result: ");
        if (((assignments * 0.2) + (quiz * 0.3) + (finaleExam * 0.5)) > 60){
            System.out.println("Pass");
        }
        else
            System.out.println("Failed");

    }

    public static void checkingNumbers() {
        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();

        if (first > second)
            System.out.println("The first number is bigger");
        else if (second > first)
            System.out.println("The second number is bigger");
        else
            System.out.println("The numbers are even");


        if (first % 2 == 0)
            System.out.println("The first number is even");
        else
            System.out.println("The first number is odd");


        if (second % 5 == 0)
            System.out.println("The second number is divisible by 5");
        else
            System.out.println("The second number isn't divisible by 5");


        if (first + second > 0)
            System.out.println("The sum of both numbers is positive");
        else if (second + first < 0)
            System.out.println("The sum of both numbers is negative");
        else
            System.out.println("The sum of both numbers is 0");
    }

    public static void ticketPricingSystem() {
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        if (age < 0)
            System.out.println("An invalid input was entered");
        else if (age < 6 && age >= 0)
            System.out.println("You get a free entrance");
        else if (age < 18 && age >= 6)
            System.out.println("The price is 30");
        else if (age < 64 && age >= 18)
            System.out.println("The price is 45");
        else
            System.out.println("The price is 25");
    }

    public static void wordInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to get information about it: ");
        String word = scanner.nextLine();

        int wordLength = word.length();
        String upper = word.toUpperCase();
        String lower = word.toLowerCase();
        char firstChar = word.charAt(0);
        char lastChar = word.charAt(wordLength - 1);

        System.out.println("Length: " + wordLength);
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);
    }

    public static void f10() {
        int a = 7;
        int b = 2;
        System.out.println(a / b);
        System.out.println(a / 2.0);

        int num = 2147483647;
        System.out.println(num);
        System.out.println(num + 1);

        double c = 0.1;
        double d = 0.2;
        System.out.println(c + d);
        System.out.println(c + d == 0.3);

        float smallPrecision = 100000000.0f;
        double highPrecision = 100000000.0;
        System.out.println(smallPrecision + 1);
        System.out.println(highPrecision + 1);
    }
}