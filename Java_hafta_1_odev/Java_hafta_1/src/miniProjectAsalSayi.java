import java.util.Scanner;

public class miniProjectAsalSayi {
    public static void main(String[] args) {

        int sayi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayı giriniz: ");

        sayi = scanner.nextInt();
        asalMi(sayi);
    }
    public static void asalMi(int sayi){
        int toplam = 0;
        for(int i=1; i<=sayi;i++){
            if(sayi % i == 0){
                toplam++;
            }
        }
        if(toplam == 2 ){
            System.out.println("Asal Sayidir");
        }else {
            System.out.println("Asal Sayı Değildir1");
        }
    }
}
