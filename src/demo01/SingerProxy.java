package demo01;

import demo01.ISinger;

public class SingerProxy implements ISinger {
    private ISinger iSinger;
    public SingerProxy(ISinger iSinger){
        this.iSinger = iSinger;
    }

    @Override
    public void sing() {
        System.out.println("开启事务");
        iSinger.sing();
        System.out.println("结束事务");
    }

    @Override
    public void introduce() {
        System.out.println("开启事务");
        iSinger.introduce();
        System.out.println("结束事务");
    }


}
