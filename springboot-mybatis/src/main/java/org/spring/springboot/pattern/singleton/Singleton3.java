package org.spring.springboot.pattern.singleton;

/**
 * 双重锁机制
 * @author yigang.wu
 * @date created in $time $date
 */
public class Singleton3 {

    private static Singleton3 singleton3 = null;

    private Singleton3(){}

    public static Singleton3 getSingleton3(){
        if(singleton3 == null){
            Singleton3 s3;
            synchronized (Singleton3.class){
                s3 = singleton3;
                synchronized (Singleton3.class){
                    if(s3 == null){
                        s3 = new Singleton3();
                    }
                }
                singleton3 = s3;
            }
        }
        return singleton3;
    }
}
