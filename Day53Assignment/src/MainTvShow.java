import java.util.ArrayList;
import java.util.Scanner;

public class MainTvShow {
    public static void main (String[] args){
        TvShow ts1 = new TvShow();
        TvShow ts2 = new TvShow("Fantacy", 21);
        TvShow ts3 = new TvShow("Abdul Kalam", "Non-fiction");
        System.out.println(ts1);
        System.out.println(ts2);
        System.out.println(ts3);
        Scanner sc = new Scanner(System.in);
        ArrayList<TvShow> tvshows =new ArrayList<TvShow>();
        while(true){
            System.out.println("Name of the show:");
            String str1 = sc.nextLine();
            if(str1.isEmpty()){
                break;
            }
            System.out.println("How many episodes?");
            int epi = Integer.parseInt(sc.nextLine());
            if(epi==0){
                break;
            }


            System.out.println("What is the genre?");
            String str3 = sc.nextLine();
            if(str3.isEmpty()){
                break;
            }
            tvshows.add(new TvShow(str1, str3,epi));
        }
        for(int i=0; i<tvshows.size(); i++){
            System.out.println(tvshows.get(i));
        }
    }
}
