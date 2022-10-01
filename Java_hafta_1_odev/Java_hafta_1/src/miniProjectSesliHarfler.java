public class miniProjectSesliHarfler {
    public static void main(String[] args) {
        char harf = 'A';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın Sesli harf");
                break;
            default:
                System.out.println("İnce Sesli harf");
        }
    }
}
