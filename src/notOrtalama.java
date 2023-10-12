import java.util.Scanner;

public class notOrtalama {
    public static void main(String[] args) {
// Değişkenler
        int mat, fiz, tur, kim, muz, i = 0;
        double ort;

        //Kullanıcıdan Veri Girişi
        Scanner input = new Scanner(System.in);

        //0<Matematik<100?
        System.out.print("Lütfen Matematik Notunuzu Giriniz : ");
        mat = input.nextInt();
        System.out.print("Lütfen Fizik Notunuzu Giriniz : ");
        fiz = input.nextInt();
        System.out.print("Lütfen Türkçe Notunuzu Giriniz : ");
        tur = input.nextInt();
        System.out.print("Lütfen Kimya Notunuzu Giriniz : ");
        kim = input.nextInt();
        System.out.print("Lütfen Müzik Notunuzu Giriniz : ");
        muz = input.nextInt();

        if (mat > 100 || 0 > mat) {
            mat = 0;
        } else {
            i++;
        }
        if (fiz > 100 || 0 > fiz) {
            fiz = 0;
        } else {
            i++;
        }
        if (tur > 100 || 0 > tur) {
            tur = 0;
        } else {
            i++;
        }
        if (kim > 100 || 0 > kim) {
            kim = 0;
        } else {
            i++;
        }
        if (muz > 100 || 0 > muz) {
            muz = 0;
        } else {
            i++;
        }
        ort = (mat + fiz + tur + kim + muz) / i;
        if (ort <= 55) {
            System.out.println("Sınıfta Kaldınız :(");
            System.out.println("Not Ortalamanız : " + ort);
        } else if (ort > 55 && ort <= 100) {
            System.out.println("Tebrikler Sınıfı Geçtiniz :)");
            System.out.println("Not Ortalamanız : " + ort);
        } else {
            System.out.println("Geçersiz Not Girdiniz : ");
        }

    }
}
