public class recapDemo2 {
    public static void main(String[] args) {
        double[] myList = {1.2, 1.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {

            if (max < number) {
                max = number;
            }

            total = total + number;


        }

        System.out.println("Toplam= " + total);
        System.out.println("En büyük Sayı= " + max);


        System.out.println("----------------------------");

        double[] AnotherList = {1.1,5.2,3.4,9.2};

        double total2 = 0;
        double max2 = AnotherList[0];

        for(double antlist:AnotherList){
            System.out.println(antlist);
            total2 = total2 + antlist;

            if(max2<antlist){
                max2=antlist;
            }





        }
        System.out.println("Toplam = "+ total2);
        System.out.println("En büyük = " + max2);









    }
}
