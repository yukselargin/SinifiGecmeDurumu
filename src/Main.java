import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, kim, fzk, turkce, tarih, mzk, counter=6,total=0;
        double avarage;
        Scanner giris = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Girin: ");
        mat = giris.nextInt();
        System.out.print("Kimya Notunuzu Girin: ");
        kim = giris.nextInt();
        System.out.print("Fizik Notunuzu Girin: ");
        fzk = giris.nextInt();
        System.out.print("Türkçe Notunuzu Girin: ");
        turkce = giris.nextInt();
        System.out.print("Tarih Notunuzu Girin: ");
        tarih = giris.nextInt();
        System.out.print("Müzik Notunuzu Girin: ");
        mzk = giris.nextInt();


        if (mat<0 || mat>100) {
            --counter;
        }else{
            total=total +mat;
        }
        if(kim<0 || kim>100) {
            --counter;
        }else {
            total = total+kim;
        }
        if (fzk<0 || fzk>100) {
            --counter;
        }else {
            total = total+fzk;
        }
        if (turkce<0 || turkce>100) {
            --counter;
        }else {
            total = total+turkce;
        }
        if (tarih<0 || tarih>100) {
            --counter;
        }else {
            total = total+tarih;
        }
        if (mzk<0 || mzk>100) {
            --counter;
        }else {
            total = total+mzk;
        }

        avarage=(total)/(counter);
        System.out.println(+total);
        System.out.println("Not ortalamanız: "+avarage);
        if(avarage>=55){
            System.out.print("Sınıf geçtiniz");
        }else{
            System.out.print("Sınıfta kaldınız");
        }

    }
}