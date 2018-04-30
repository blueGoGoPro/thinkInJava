package com.thinkinjava.test.kpoint8;

/**
 * Created by yongQiang_Wang on 2018/4/10.
 */
class Water {
    public String clean(){
        return "baseWater";
    }
    public void drink(){
        System.out.println(clean());
    }
}
class WaHaha extends Water{
    @Override
    public String clean() {
        return "wahahha";
    }
}
public class WaterTest{
    public static void main(String[] args) {
        Water water = new WaHaha();
        water.drink();
        String hello = "Hello";
        String b ="Hello";
        System.out.println(hello == b);

    }

}
