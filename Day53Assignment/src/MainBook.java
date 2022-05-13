import java.util.Scanner;
import java.util.ArrayList;

public class MainBook {
    public static void main (String[] args){
        Book book0 = new Book();
        Book book2 = new Book("BhagvadGeeta", 4000);
        Book book3 = new Book(1000, 2007);
        System.out.println(book0);
        System.out.println(book2);
        System.out.println(book3);
        Scanner sc = new Scanner(System.in);
        ArrayList<Book>book1 = new ArrayList<Book>();
        while(true){
            System.out.println("Name of the book:");
            String str = sc.nextLine();
            if(str.isEmpty()){
                break;
            }
            System.out.println("Number of pages?");
            int num1 = Integer.parseInt(sc.nextLine());
            if(num1==0){
                break;
            }
            System.out.println("Publication year?");
            int num2 = Integer.parseInt(sc.nextLine());
            if (num2==0){
                break;
            }
            book1.add(new Book(str, num1,num2));
        }
         System.out.println("What information will be printed ? everything or name");
         String str1 = sc.nextLine();
         if(str1.equals("everything")){
             for (int i=0; i<book1.size(); i++){
                 System.out.println(book1.get(i));
             }
         }
         else if(str1.equals("name")){
             for(int i=0; i<book1.size();i++){
                 System.out.println(book1.get(i).getName());
             }
         }


    }
    
}
