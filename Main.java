import java.util.Scanner;
public class Main {
    public static void main(String[] orgs) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı girin: ");
        a = input.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        b = input.nextInt();
        System.out.print("Üçüncü sayıyı girin: ");
        c = input.nextInt();

        if (a> b && a > c) {
            if (b > c) {
                System.out.println(" c < b < a ");
            } else {
                System.out.println(" b < c < a " );
            }
        } else if (b > a && b > c) {
            if ( a > c ) {
                System.out.println(" c < a < b ");
            } else {
                System.out.println(" a < c < b ");
            }
        } else {
            if (a > b) {
                System.out.println(" b < a < c");
            } else {
                System.out.println("a < b < c ");
            }
        }
        }
    }









































