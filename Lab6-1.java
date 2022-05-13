import java.util.*;

public class Lab6 {
    public static void main(String[] args) {

    // Exercise 1

    int [] array = {67, 100, 46, 78, 75, 81, 86, 49, 21, 68, 17, 44, 54, 37, 9, 15, 60, 97, 98, 25};
        System.out.println("Exercise 1 Unsorted:");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Exercise 1 Sorted:");
        System.out.println(Arrays.toString(array));


        // Exercise 2
        String[] countries = {"Egypt", "Switzerland", "USA", "Argentina", "Spain", "Portugal", "Luxemburg"};
        System.out.println("Exercise 2 Unsorted:");
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println("Exercise 2 Unsorted:");
        System.out.println(Arrays.toString(countries));

        // Exercise 3

        int num;
        ArrayList<Integer> nums = new ArrayList<Integer>(20);

        for (int i = 0; i < 20; i++) {
            num = (int)(Math.random() * 100);
            nums.add(num);
        }
        System.out.println("Exercise 1 Rewritten for Exercise 3 Unsorted:");
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println("Exercise 1 Rewritten for Exercise 3 Sorted:");
        System.out.println(nums);


        ArrayList<String> countries2 = new ArrayList<String>();
        countries2.add("Egypt");
        countries2.add("Switzerland");
        countries2.add("USA");
        countries2.add("Argentina");
        countries2.add("Spain");
        countries2.add("Portugal");
        countries2.add("Luxemburg");

        System.out.println("Exercise 2 Rewritten for Exercise 3 Unsorted:");
        System.out.println(countries2);
        Collections.sort(countries2);
        System.out.println("Exercise 2 Rewritten for Exercise 3 Sorted:");
        System.out.println(countries2);

        nums.add(200);
        countries2.add("Russia");
        Collections.sort(nums);
        System.out.println("Exercise 1 w/ additional element:");
        System.out.println(nums);
        Collections.sort(countries2);
        System.out.println("Exercise 2 w/ additional element:");
        System.out.println(countries2);

    }
}
