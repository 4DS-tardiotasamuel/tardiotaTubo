import java.util.Scanner;

public class MainTubo {

    public static void main(String[] args) {
        float r, a;
        boolean check = true;
        Tubo tb = null;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Inserire il raggio: ");
            r = input.nextFloat();
            System.out.print("Inserire l'altezza: ");
            a = input.nextFloat();
            try {

                tb = new Tubo(r, a);
                check = true;

            } catch (Exception e) {
                System.out.println(e.getMessage());
                check = false;
            }
        }while(!check);

        System.out.println("La superficie del tubo e' pari a: "+ tb.superficie() + "cm^2");
        System.out.println("Il volume del tubo e' pari a: "+ tb.volume() + "cm^2");

    }
}
