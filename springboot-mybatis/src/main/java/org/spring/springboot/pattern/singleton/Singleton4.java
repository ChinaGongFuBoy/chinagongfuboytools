package org.spring.springboot.pattern.singleton;

/**
 * 静态内部类实现单利
 * @author yigang.wu
 * @date created in $time $date
 */
public class Singleton4 {

    private Singleton4(){}

    private static class SingletonInstance{
        public final static Singleton4 sinleton4 = new Singleton4();
    }

    public static Singleton4 getSingleton4(){
        return SingletonInstance.sinleton4;
    }
}
