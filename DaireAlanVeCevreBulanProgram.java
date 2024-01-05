import java.util.Scanner;
public class DaireAlanVeCevreBulanProgram {
    public static void main (String[]args) {

        int r, a;
        double pi = 3.14, alan, cevre, dilimalan;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = inp.nextInt();
        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Daire alani: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);

        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        a = inp.nextInt();
        dilimalan = (pi * (r*r) * a ) / 360;
        System.out.println("Daire diliminin alanı: " + dilimalan);
    }
}
