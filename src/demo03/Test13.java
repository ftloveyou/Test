package demo03;


import java.util.ArrayList;
import java.util.List;

public class Test13 {
    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(getList(10));
    }

    private static int sum(int max){
        int sum = 0;
        for (int i = 0; i < max; i++){
            sum += i;
        }
        return sum;
    }

    private static List<String> getList(int max){
        List<String> strList = new ArrayList();
        for (int i = 0;i < max;i++){
            strList.add(String.valueOf(i));
        }
        return strList;
    }


}
