package demo03;

import java.math.BigDecimal;

public class Test10 {
    public static void main(String[] args) {

        BigDecimal b1 = new BigDecimal("1.00000001");
        BigDecimal b2 = new BigDecimal("2.000002");
        Double d1 = 1.00000001;
        Double d2 = 2.000002;
        System.out.println(b1.add(b2));
        System.out.println(b1.divide(b2, 2, BigDecimal.ROUND_DOWN));
        System.out.println(d1+d2);

    }
}
