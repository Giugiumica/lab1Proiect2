
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Nimeni nu stie");
        System.out.println("problema 1 tema");
        Scanner scanner=new Scanner(System.in);
        int perimetru;
        System.out.println("Introdu latura mare : ");
        int L= scanner.nextInt();
        System.out.println("Introdu latura mica : ");
        int l= scanner.nextInt();


        perimetru=2*l+2*L;
        System.out.println("Perimetrul este : "+perimetru);

    }
}