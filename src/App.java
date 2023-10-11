import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    // Scanner tangentbord=new Scanner(System.in);
    // System.out.println("Ange ett tal:");
    // int tal=tangentbord.nextInt();
    // int x=500;
    // tal+=x;
    // tal/=1000;
    // tal*=1000;
    // System.out.println("Ditt tal avrundat till närmaste tusental blir "+tal);
    
    Scanner tangentbord=new Scanner(System.in);
    System.out.println("Ange täljare:");
    int täljare=tangentbord.nextInt();
    System.out.println("Ange nämnare:");
    int nämnare=tangentbord.nextInt();
    int heltal=täljare/nämnare;
    int rest=täljare%nämnare;
    System.out.println(täljare+"/"+nämnare+" i blandad form blir "+heltal+" "+rest+"/"+nämnare);
    

    

    }
}
