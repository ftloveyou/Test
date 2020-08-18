package demo04;

public class Test03 {
    public static void main(String[] args) {
        Test01 test01 = new Test01Impl();
        System.out.println(test01.get());
        Test01 test011 = new Test02Impl();
        System.out.println(test011.get());
    }
}
