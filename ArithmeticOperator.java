import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int time = scanner.nextInt(); //정수로 받음
        int second = time % 60;//60으로 나눈 나머지가 초
        int minute = (time/60)%60;//처음 60으로 나눈 값을 60으로 다시 나눈 나머지가 분
        int hour = (time/60) / 60;//60으로 두번 나눈 값이 시

        System.out.print(time + "초는 ");
        System.out.print(hour + "시간, ");
        System.out.print(minute + "분, ");
        System.out.print(second + "초 입니다.");
        scanner.close();
    }
}