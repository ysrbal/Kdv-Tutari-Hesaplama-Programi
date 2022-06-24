import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        double fiyat, kdv, kdvdahil, kdvorani;
        boolean kdvdurumu;

        System.out.print("Urun Fiyati Giriniz :");
        fiyat= girdi.nextDouble();

        kdvdurumu = (fiyat<=1000);
        kdvorani = kdvdurumu ? 0.18 : 0.08;
        System.out.println("KDV Orani :" + kdvorani);

        kdv = fiyat * kdvorani;
        System.out.println("KDV Tutari :" + kdv + "TL");

        kdvdahil = fiyat + kdv;
        System.out.println("KDV Dahil Toplam Tutar :" + kdvdahil + "TL");

    }
}
