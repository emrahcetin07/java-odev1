public class stringsDemo {
    public static void main(String[] args) {
        String mesaj = "Bugun hava cok guzel";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı:" + mesaj.length());
        System.out.println("5.eleman: " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın"));
        System.out.println(mesaj.startsWith("B"));
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("av")); // av harfi kaçıncı karakterde?
        System.out.println(mesaj.lastIndexOf("e")); // aramaya sağdan yani sondan başladı ve karakter sayısını verdi
    }
}
