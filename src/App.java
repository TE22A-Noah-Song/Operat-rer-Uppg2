import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner tangentbord=new Scanner(System.in);
    System.out.println("Ange ett tal:");
    int tal=tangentbord.nextInt();
    int x=500;
    tal+=x;
    tal/=1000;
    tal*=1000;
    System.out.println("Ditt tal avrundat till närmaste tusental blir "+tal);
    


    

    }
}
