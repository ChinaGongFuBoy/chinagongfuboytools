package org.spring.springboot.pattern.singleton;

/**
 * 懒汉单利
 * @author yigang.wu
 * @date created in $time $date
 */
public class Singleton2 {

    private static Singleton2 singleton2 = null;

    private Singleton2(){

    }

    public Singleton2 getSingleton2(){
        if(singleton2 != null){
            singleton2 = new Singleton2();
            return singleton2;
        }
        return null;
    }
}
