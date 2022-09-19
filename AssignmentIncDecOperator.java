public class AssignmentIncDecOperator {
    public static void main(String[] args) {
        int a=3, b=3, c=3;

        a+=3;//== a = a+3
        b*=3;//== b = b*3
        c%=2;//== c = c%2
        System.out.println("a="+ a +", b=" + b + ", c=" + c);

        int d=3;
        a=d++; //대입후 증가
        System.out.println("a=" + a + ", d=" + d);

        a=++d; //증가후 대입
        System.out.println("a=" + a + ", d=" + d);

        a=d--; //대입후 감소
        System.out.println("a=" + a + ", d=" + d);

        a=--d; //감소후 대입
        System.out.println("a=" + a + ", d=" + d);
    }
}
