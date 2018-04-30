package com.thinkinjava.test.kpoint7;

/**
 * Created by yongQiang_Wang on 2018/4/8.
 * @page 130
 * @task 5
 */
class A{
    A(int i){
        System.out.println("构造了A-----------");
        System.out.println(i);
    }
}
class B{
    B(){
        System.out.println("构造了B-----------");
    }
}
public class C extends A{
    public static B b1;
    public B b;
    C(){
        /**
         * 调用基类构造器是子类/导出类构造器中第一件要做的事
         */
        super(1);
        System.out.println("构造了C-----------");
    }
    static {
        b1 = new B();
    }
    public void githubCommitTest(){
        System.out.println("我成功 的提交了呢");
    }
    public void again(){
        System.out.println("再一次尝试idea直接提交");
    }
    public void thirdTime(){
        System.out.println("修改ssh设置后的提交");
    }
    public static void main(String[] args) {
        C c = new C();
    }
}
