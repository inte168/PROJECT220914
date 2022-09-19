// 2.2
public class CircleArea {
    public static void main(String[] args) {
        final double PI = 3.14; //상수로 원주율 선언

        double radius = 10.0; //반지름
        double circleArea = radius*radius*PI; //원의 면적 계산

        //화면에 면적 출력
        System.out.println("원의 면적 = " + circleArea);
    }
}