public class arraysDemo {
    public static void main(String[] args) {

        String[] ogrenciler = new String[4];

        ogrenciler[0]="Engin";
        ogrenciler[1]="Derin";
        ogrenciler[2]="Salih";
        ogrenciler[3]="Mehmet";


        for(int i=0; i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }




    }
}
