public class UjianLogic {
    public static void main(String[] args) {

        int total=0;

        for (int i = 4; i < 200; i = i + 4) {
            if (i != 4) {
                System.out.print(i+" ");
                total = total+i;
            }
        }
        System.out.print("\nTotal Seluruh Angka Antara 4 - 200 Keliapatan 4 adalah = " + total);
    }
}
