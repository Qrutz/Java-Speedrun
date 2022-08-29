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
