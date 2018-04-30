package com.thinkinjava.test.kpoint12;

/**
 * Created by yongQiang_Wang on 2018/4/22.
 */


class BaseballException extends Exception{}
class Foul extends BaseballException{}
class Strike extends BaseballException{}
abstract class Inning{
    public Inning() throws BaseballException{}
    public void event() throws BaseballException {

    }
    public abstract void atBat() throws Strike,Foul;
    public void walk(){}
}

class StormException extends Exception{}
class RainedOut extends StormException{}
class PopFoll extends Foul{}

interface Storm {
    public void event()throws RainedOut;
    public void rainHard() throws RainedOut;
}

public class StormyInning extends  Inning implements Storm{

    public StormyInning ()throws BaseballException,RainedOut{

    }
    public StormyInning(String s) throws BaseballException{

    }

    /**
     * 重写方法 异常必须小于父类异常
     * @throws Strike
     * @throws Foul
     */
//    public void walk() throws PopFoll{
//
//    }



    public void atBat() throws Strike, Foul {

    }
    public void event() {

    }

    public void rainHard() throws RainedOut {

    }


}





















