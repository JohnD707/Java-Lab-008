import java.util.Scanner;

public class WallsAndBeer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many bottles of beer are on the wall?");
        int bottles = scanner.nextInt();

        song(bottles);
    }

    public static void song(int bottles) {
        if (bottles > 0) {
            singVerse(bottles);
            System.out.println();
            song(bottles - 1);
        } else {
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!");
        }
    }
    public static void singVerse(int bottles) {
        System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
        System.out.println("Take one down and pass it around, " + (bottles - 1) + " bottles of beer on the wall.");
    }
}