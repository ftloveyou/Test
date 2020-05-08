package demo01;

public class Demo {
    public static void main(String[] args) {
        ISinger isinger = new SingerImpl();
        SingerProxy singerProxy = new SingerProxy(isinger);
        singerProxy.introduce();
        singerProxy.sing();
    }
}
