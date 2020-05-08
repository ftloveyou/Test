package demo01;

import demo01.ISinger;

public class SingerImpl implements ISinger {
    @Override
    public void sing() {
        System.out.println("我唱歌");
    }

    @Override
    public void introduce() {
        System.out.println("我介绍");
    }
}
