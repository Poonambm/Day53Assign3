import java.util.Scanner;
import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        Animal a1 = new Animal();
        Animal a2 = new Animal("Moti");
        Animal a3 = new Animal(true);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        ArrayList<Animal> animals = new ArrayList<Animal>();

        while (true) {
            System.out.println("Animal Menu");
            System.out.println("Entering nothing will stop the loop");
            System.out.println("Please enter a name:");
            String str1 = sc.nextLine();
            if (str1.isEmpty()) {
                break;
            }
            System.out.println("Is it a dog? Yes or no:");
            String str2 = sc.nextLine();
            if (str2.isEmpty()) {
                break;
            }
            boolean isDog = false;
            if (str2.equals("yes")) {
                isDog = true;
            }
            animals.add(new Animal(str1, isDog));
        }
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
    }

}
