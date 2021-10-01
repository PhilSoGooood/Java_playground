import java.util.Scanner;
public class gugudan {
    public static void main(String[] args) {
        // 이중 for문 및 배열을 활용한 구구단 구현
        int[] gugudan;
        gugudan = new int[9];
        for(int i = 1; i < 10; i++) {
            for(int j = 0; j < gugudan.length; j++) {
                gugudan[j] = i * (j+1);
                System.out.println(gugudan[j]);
            }
        }
    }
}
