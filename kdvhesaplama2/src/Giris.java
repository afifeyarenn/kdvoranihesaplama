import java.util.Scanner;

public class Giris {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18 ;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz :");
        tutar = input.nextDouble();
        double kdvTutar = tutar*kdvOran;
        double kdvliTutar = tutar+kdvTutar;

        kdvOran = (tutar<=1000) && (tutar>=0) ? 0.18 : 0.08;


        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'li Tutar : " + kdvliTutar);





    }

}
