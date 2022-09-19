public class LogicalOperator {
    public static void main(String[] args) {

        //비교연산
        System.out.println('a' > 'b');
        System.out.println(3 >= 2);
        System.out.println(-1 < 0);
        System.out.println(3.45 <=2);
        System.out.println(3 == 2);
        System.out.println(3 != 2);
        System.out.println(!(3 != 2));

        //비교와 논리연산 복합
        System.out.println((3>2) && (3>4));
        System.out.println((3 !=2) /*|| (-1>0)*/); //앞쪽이 참이되어 식은 논리와 관계없이 true가 되어 뒤가 실행되지 않음(dead code)
        System.out.println((3 !=2) ^ (-1>0));
    }
}
