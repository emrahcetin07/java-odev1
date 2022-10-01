import java.util.Scanner;

public class miniProjectMukemmelSayi {
    public static void main(String[] args) {
        long sayi;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");

        sayi = scan.nextLong();
        mukemmel(sayi);



    }
    public static void mukemmel(long sayi){
        long toplam = 0;

        for(long i=1; i<sayi; i++){
            if(sayi % i == 0){
                toplam = toplam +i;
            }
        }

        if(toplam == sayi){
            System.out.println("Mükemmel Sayidir.");
        } else {
            System.out.println(("Mükemmel Sayi Değildir."));
        }

    }
}
