package com.thinkinjava.test.kpoint11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by yongQiang_Wang on 2018/4/16.
 */
class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Stush extends Snow{}
class Rain{}
public class TestList {
    public static void main(String[] args) {
        List<Snow> list = Arrays.asList(new Powder(),new Crusty(),new Stush());
        List<Powder> list1 = Arrays.asList(new Light(),new Heavy());
        /**
         * 如果数组里面只有子类的子类,那么数组只能指定为子类,不能直接指定为父类
         */
        //List<Snow> list2 = Arrays.asList(new Light(),new Heavy());
        List<Snow> list3 = new ArrayList<Snow>();
        //list.add(new Powder());
        list3.add(new Light());
        list3.add(new Heavy());
        /**
         * add 的时候可以所有的元素都添加子类的子类,而不能添加没有继承关系的类
         */
        //list3.add(new Rain());

        /**
         * HashSet 是无序的,TreeSet按照比较结果保存元素,而LinkedHashSet 则按照元素被添加的顺序保存,并非所有的Set都是无序的
         */
        Iterator<Snow> it = list.iterator();



    }
}
