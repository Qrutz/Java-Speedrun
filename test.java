import java.util.*;
import java.io.*;
import java.net.URL;

class ShoppingCart {
    static List<String> arrayCart = new ArrayList<String>();

    public static void main(String[] args) {

        arrayCart.add("Shrimp");

        addToCart("fish");

        addToCart("Skyr");

        // System.out.print(arrayCart);

        // System.out.print(length());

        // printAllItemsStartingWithS();

        removeItem("Skyr");

        System.out.print(arrayCart);

    }

    static void addToCart(String item) {
        arrayCart.add(item);
    }

    static void removeItem(String item) {
        arrayCart.remove(item);
    }

    static void printAllItemsStartingWithS() {
        for (int i = 0; i < length(); i++) {
            String item = arrayCart.get(i);
            char firstChar = item.charAt(0);
            if (firstChar == 'S') {
                System.out.println(arrayCart.get(i));
            }
        }
    }

    private static int length() {
        int length = 0;

        for (String i : arrayCart) {
            length = length + 1;
        }

        return length;
    }

}

class GenderGame {
    public static void main(String[] args) {
        String gender, fname, lname, age;
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("What is your gender? ");
            gender = myObj.nextLine();
            if (gender == "F") {
                String outx = "Ms";
            } else if (gender == "M") {
                String outx = "Mr";
            }

            System.out.println("First name: ");
            fname = myObj.nextLine();

            System.out.println("Last name: ");
            lname = myObj.nextLine();

            System.out.println("Age: ");
            age = myObj.nextLine();

            String output = String.format("fasdfas %s");

            System.out.print(output);
        }
    }
}

class FizzBuzz {
    public static void main(String[] argsv) {

        for (int i = 1; i < 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}

class AreaCalculator {

    public static void main(String[] argsv) {
        int Shape;

        try (Scanner Input = new Scanner(System.in)) {
            System.out.print("\n 1) Triangle");
            System.out.print("\n 2) Rectangle");
            System.out.print("\n 3) Square");
            System.out.print("\n 4) Circle");
            System.out.print("\n 5) Quit \n");

            System.out.print("\n Which Shape?  ");

            Shape = Input.nextInt();

            System.out.println(Shape);

            if (Shape == 1) {
                // Tri area
                int base, height, area;
                try (Scanner in = new Scanner(System.in)) {
                    System.out.print("\n  Base: ");
                    base = in.nextInt();
                    System.out.print("\n  Height: ");
                    height = in.nextInt();

                    area = ((base * height) / 2);

                    System.out.println(String.format("The area is %s", area));

                }

            } else if (Shape == 2) {
                // Rec area
                int base, height, area;
                try (Scanner in = new Scanner(System.in)) {
                    System.out.print("\n  Base: ");
                    base = in.nextInt();
                    System.out.print("\n  Height: ");
                    height = in.nextInt();

                    area = (base * height);

                    System.out.println(String.format("The area is %s", area));

                }

            } else if (Shape == 3) {
                // Squ area
                int base, area;
                try (Scanner in = new Scanner(System.in)) {
                    System.out.print("\n  Base: ");
                    base = in.nextInt();

                    area = (base * base);

                    System.out.println(String.format("The area is %s", area));

                }

            } else if (Shape == 5) {
                return;
            }

        }

    }
}

class WebInput {
    public static void main(String[] args) throws Exception {
        URL something = new URL("asdfasdfasdf.txt");
        Scanner WebIn = new Scanner(something.openStream());

        String one = WebIn.toString();
        System.out.println(one);
    }
}

class BinarySearch {
    public static int search(int[] nums, int target) {
        int pivot, left = 0, right = nums.length - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target)
                return pivot;
            if (target < nums[pivot])
                right = pivot - 1;
            else
                left = pivot + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input1 = { -1, 0, 3, 5, 9, 12 };
        int target = 12;

        int output = search(input1, target);

        System.out.println(output);

    }
}


class SumDigits {

    public static int sumDigits(String a) {
        // List<Character> list = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < a.length(); i++) {

            char caracter = a.charAt(i);
            if (Character.isDigit(caracter)) {
                count = count + (Integer.parseInt(String.valueOf(a.charAt(i))));
            }
        }
        return count;

    }

    public static void main(String[] args) {
        String f = "aa1bc2d3";
        System.out.println(sumDigits(f));
    }
}

class ShiftLeft {
    public static int[] shiftLeft(int[] arr) {
        int[] copyarr = arr;

        System.out.println(copyarr);
        if (copyarr.length == 1) {
            return copyarr;
        } else {

            for (int i = 0; i < 1; i++) {
                int j, first;
                first = copyarr[0];

                for (j = 0; j < copyarr.length - 1; j++) {
                    copyarr[j] = copyarr[j + 1];
                }
                copyarr[j] = first;
            }

            return copyarr;
        }
    }

    public static void main(String[] args) {
        int[] inpt = { 6, 2, 5, 3 };
        int[] ot = shiftLeft(inpt);
        for (int i = 0; i < ot.length; i++) {
            System.out.println(ot[i]);
        }

    }
}
class Concat {
    public int[] getConcatenation(int[] nums) {
        int[] xd = new int[(nums.length)*2];
        
        for (int i = 0; i < nums.length; i++) {
            xd[i] = nums[i];
            xd[i+(nums.length)] = nums[i];
        }
        return xd;
    }
}


class PascalsT {

    public static List<List<Integer>> pascals(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0)
            return triangle;

        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev_row = triangle.get(i - 1);
            List<Integer> current_row = new ArrayList<>();
            current_row.add(1);

            for (int j = 1; j < i; j++) {
                
                current_row.add((prev_row.get(j - 1)) + prev_row.get(j));
            }

            current_row.add(1);
            triangle.add(current_row);

        }
        return triangle;

    }

    public static void main(String[] args) {
        System.out.println(pascals(5));

    }
}


class FizzArray {
    public static List<Integer> fizzArray(int a, int b) {
        List<Integer> list1 = new ArrayList<>();
        if (a == b) {
            return new ArrayList<>();
        } else {
            for (int i = a; i < b; i++) {

                list1.add(i);
            }
            return list1;
        }

    }

    public static void main(String[] argv) {
        System.out.print(fizzArray(5, 6));
    }
}

class ThreeConsecutive {

    public static Boolean threeConsecutive(List<Integer> a) {
        int count = 0;
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i - 1) == a.get(i) + -1) {
                count = count + 1;
                if (count == 2) {
                    return true;
                }
            } else {
                count = 0;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(4);
        l1.add(5);

        System.out.print(threeConsecutive(l1));
    }
}


class Car {
    String carName;
    double carPrice;

    public Car(String name, double d) {
        carName = name;
        carPrice = d;
    }

    public String getName() {
        return carName;
    }

    public static void main(String[] args) {

    }

    public double getDailyPrice() {
        return carPrice;
    }

    public double calculateRent(int days) {
        return carPrice * days;
    }
}

class CarRental {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo", 210.50);
        Car car2 = new Car("Ferrari", 550.00);

        System.out.println(car1.getName() + " costs " + car1.getDailyPrice() +
                " SEKs per day.");
        System.out.println(car2.getName() + " costs " + car2.getDailyPrice() +
                " SEKs per day.");

        int days = 5; // this indicates how many days you will rent the car.
        System.out.println(car1.getName() + " costs " + car1.calculateRent(days) +
                " SEKs for " + days + " days.");
    }
}

class BankAccount {
    String AccountName;
    double AccountBalance;

    public BankAccount(String name, double balance) {
        AccountName = name;
        AccountBalance = balance;
    }

    public void withdraw(double d) {
        AccountBalance = AccountBalance - d;
    }

    public void deposit(double d) {
        AccountBalance = AccountBalance + d;
    }

    public void printBalance() {
        System.out.print(AccountBalance);
    }
}

class Bank {

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Eve", 1000.39);
        BankAccount acc2 = new BankAccount("John", 500000.00);
        BankAccount acc3 = new BankAccount("Mary", 12540000.99);

        acc1.withdraw(500.00);
        acc2.withdraw(500.00);
        acc3.withdraw(500.00);

        acc1.deposit(1500.00);

        acc1.printBalance();

    }
}

class Movie {
    String title;
    int year;
    int length;
    int likes;

    public Movie(String t, int y, int l) {
        title = t;
        year = y;
        length = l;
        likes = 0;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public void like() {
        likes += 1;
    }

    public void dislike() {
        if (likes == 0) {
            return;
        } else {
            likes -= 1;
        }
    }

}

class Netflix {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Harry Potter", 2013, 120);
        movie1.like();
        movie1.dislike();
        System.out.print(movie1.likes);
    }
}

class BattleField {

    public static void getStats(Hero h) {
        System.out.print("(" + h.getName() + "," + h.getHP() + "," + h.getMana() + ")");

    }

   

    public static void main(String[] args) {
        Skill iceMissile = new Skill("Ice Missile", 20, 3, "Ice");
        Skill fireball = new Skill("Fire Ball", 60, 5, "Fire");
        Skill atomicKick = new Skill("Atomic Kick", 35, 4, "Physical");

        // fireball.useSkill();
        // // Should print:
        // // Fire Ball causes 60 damage. (costs 5 mana)

        // iceMissile.useSkill();
        // // Should print:
        // // Ice Missile causes 20 damage. (costs 3 mana)

        Hero Batman = new Hero("Batman");
        Hero Deadpool = new Hero("Deadpool");
        Hero Samus = new Hero("Samus");

        Samus.takeDamage(50);
        Deadpool.takeDamage(90);

        Batman.useMana(50);

        getStats(Batman);
        getStats(Deadpool);
        getStats(Samus);

        Deadpool.heal(50);

        Batman.useMana(60);

        Samus.takeDamage(40);

        getStats(Batman);
        getStats(Deadpool);
        getStats(Samus);

        Samus.useMana(100);
        Deadpool.takeDamage(80);
        Batman.takeDamage(80);

        getStats(Batman);
        getStats(Deadpool);
        getStats(Samus);

    }
}

class Skill {
    String skillName;
    int damage;
    int manacost;
    String Elemental;

    public Skill(String n, int dmg, int mana, String Element) {
        skillName = n;
        damage = dmg;
        manacost = mana;
        Elemental = Element;
    }

    public void useSkill() {
        System.out.println(skillName + " causes " + damage + " of damage. (costs " + manacost + " mana)");
    }
}

class Hero {
    String name;
    int HP;
    int MP;

    public Hero(String n) {
        name = n;
        HP = 100;
        MP = 100;
    }

    public void attack(Hero targetHero, int damage){
        MP = MP - 25;
        targetHero.takeDamage(damage);
    }

    public void ultimateAbility(Hero targetHero) {
        MP = MP - 70;
        targetHero.takeDamage(80);
    }

    public void AOEAttack(Hero...heros) {
        MP = MP - 40;
        for (Hero i: heros){
            i.takeDamage(30);
        }

    }

    public void useMana(int i) {
        MP = MP - i;
        if (MP < 0) {
            MP = 0;
        }
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public int getMana() {
        return MP;
    }

    public void takeDamage(int dmg) {
        HP = HP - dmg;
        if (HP <= 0) {
            System.out.println("I died!... But i regret nothing");
        }

    }

    public void heal(int HealAmmount) {
        HP = HP + HealAmmount;
    }



}
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Assignment1 {

    public static void hashtagCollector() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type your post: ");
        String s = sc.nextLine();
        String[] splitted = s.split(" ");
        String stringOfHashtagWords = "";

        for (String word : splitted) {
            if (word.charAt(0) == '#') {
                stringOfHashtagWords += word;
                stringOfHashtagWords += " ";
            }
        }
        if (stringOfHashtagWords == "") {
            System.out.println("\nNo hashtags were typed");
        } else {
            System.out.println("\nHashtags found: " + stringOfHashtagWords);
        }
    }

    public static void highestScoreAndItsPos(int[] arr) {
        int highest = arr[0];
        int indexOfHighest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
                indexOfHighest = i;
            }
        }
        System.out.printf("\nThe highest score is %s and belongs to the %s%s student", highest, indexOfHighest,
                getOrdinal(indexOfHighest));

    }

    public static void get2HighestAndLowest(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int lowest = arr[0];
        int secondLowest = arr[1];
        int highest = arr[arr.length - 1];
        int secondHighest = arr[arr.length - 2];

        System.out.printf("The two lowest scores provided are %s, and %s", lowest,
                secondLowest);
        System.out.printf("\nThe two highest scores provided are %s, and %s\n",
                highest, secondHighest);
    }

    public static void getMean(int[] arr) {
        Locale.setDefault(Locale.ENGLISH);

        double sum = 0;
        for (Integer i : arr) {
            sum += i;
        }

        double average = sum / arr.length;

        System.out.format("The mean of the numbers is %.2f%n", average);

    }

    public static String getOrdinal(int n) {
        String ordinal;
        if (n == 1) {
            ordinal = "st";
        } else if (n == 2) {
            ordinal = "nd";
        } else if (n == 3) {
            ordinal = "rd";
        } else {
            ordinal = "th";
        }
        return ordinal;
    }

    public static int[] getScores() {
        Scanner input = new Scanner(System.in);
        int[] out = new int[7];
        int i = 1;

        do {

            System.out.print("Enter the Score for the " + i + getOrdinal(i) + " student: ");
            int score = input.nextInt();

            if ((score <= 100) && (score >= 0)) {
                out[i - 1] = score;
                i += 1;
            } else {
                System.out.println("Error - Input out of bound. Score can only be between 0 and 100");
                continue;
            }

        } while (i <= out.length);

        System.out.println("Thank you for your input. Your entered scores are: ");
        System.out.println(Arrays.toString(out));
        return out;
    }

    public static void main(String[] args) {

        boolean on = true;

        int[] o = getScores();

        Scanner n = new Scanner(System.in);
        int option;

        do {

            System.out.println("Welcome to the menu. Choose one of the options below:");
            System.out.println("  1. Register new scores for students.");
            System.out.println("  2. Calculate the mean of the entered scores");
            System.out.println("  3. Find the two highest and two lowest scores");
            System.out.println("  4. Find the highest score and its position.");
            System.out.println("  5. Collect hashtags from a post.");
            System.out.println("  6. To exit");

            System.out.print("Type your option: ");
            option = n.nextInt();

            if (option == 1) {
                o = getScores();
            } else if (option == 2) {
                getMean(o);
            } else if (option == 3) {
                get2HighestAndLowest(o);
            } else if (option == 4) {
                highestScoreAndItsPos(o);
            } else if (option == 5) {
                hashtagCollector();
            } else if (option == 6) {
                System.out.println("Thank you for using our grading system. Have a nice day!");
                break;
            } else {
                System.out.println("Error - Invalid value. Please type between 1 and 6");
            }

        } while (true);

    }
}



