//구구단 출력표_장수민
public class gugudan {
    public static void gugudan(String[] args) {
        System.out.println("[구구단 출력]");

        for (i = 1; i<=9; i++) {

            for (int k = 1; k <= 9; k++){
                System.out.println(String.format("%02d x %02d = %02d\t", k, i, k*i));
            }

                System.out.println();

        }
    }
}
