public class BitOperator {
    public static void main (String[] args) {
        short a = (short)0x55ff;
        short b = (short)0x00ff;

        //비트 논리 연산
        System.out.println("[비트연산결과]");
        System.out.printf("%04x\n", (short)(a & b));
        System.out.printf("%04x\n", (short)(a | b));
        System.out.printf("%04x\n", (short)(a ^ b));
        System.out.printf("%04x\n", (short)(~a));

        /*
         <<와 >>>이 짝이다(각 방향으로 시프트 후 빈칸에 0삽입)
         >>은 최상위비트가 유지된다.
         */
        
        byte c = 20;
        byte d = -8;

        //비트 시프트 연산
        System.out.println("[시프트연산결과]");
        System.out.println(c <<2);
        System.out.println(c >>2);
        System.out.println(d >> 2);
        System.out.printf("%x\n", (d >>> 2));

    }
}
