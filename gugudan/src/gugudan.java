import java.util.Scanner;
public class gugudan {
    public static void main(String[] args) {
        //2단
//        System.out.println("2단");
//        System.out.println(2 * 1);
//        System.out.println(2 * 2);
//        System.out.println(2 * 3);
//        System.out.println(2 * 4);
//        System.out.println(2 * 5);
//        System.out.println(2 * 6);
//        System.out.println(2 * 7);
//        System.out.println(2 * 8);
//        System.out.println(2 * 9);

        //3단
//        System.out.println("3단");
//        System.out.println(3 * 1);
//        System.out.println(3 * 2);
//        System.out.println(3 * 3);
//        System.out.println(3 * 4);
//        System.out.println(3 * 5);
//        System.out.println(3 * 6);
//        System.out.println(3 * 7);
//        System.out.println(3 * 8);
//        System.out.println(3 * 9);

        //4단
//        System.out.println("4단");
//        int result = 4 * 1;
//        System.out.println(result);
//        result = 4 * 2;
//        System.out.println(result);
//        result = 4 * 3;
//        System.out.println(result);
//        result = 4 * 4;
//        System.out.println(result);
//        result = 4 * 5;
//        System.out.println(result);
//        result = 4 * 6;
//        System.out.println(result);
//        result = 4 * 7;
//        System.out.println(result);
//        result = 4 * 8;
//        System.out.println(result);
//        result = 4 * 9;
//        System.out.println(result);

        // 입력받아서 구구단 출력
//        System.out.println("구구단 중 출력할 단은? : ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        System.out.println(number * 1);
//        System.out.println(number * 2);
//        System.out.println(number * 3);
//        System.out.println(number * 4);
//        System.out.println(number * 5);
//        System.out.println(number * 6);
//        System.out.println(number * 7);
//        System.out.println(number * 8);
//        System.out.println(number * 9);

        // while 반복문 활용
        int i = 1;
        while (i < 10) {
            int j = 1;
            while (j < 10) {
                System.out.println(i * j);
                j++;
            }
            i++;
        }

        // for 반복문 활용
//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i * j);
//            }
//        }
    }
}
