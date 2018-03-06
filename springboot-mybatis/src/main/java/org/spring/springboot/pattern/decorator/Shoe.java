package org.spring.springboot.pattern.decorator;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
public class Shoe extends Clothe {

    public void show(){
        super.show();
        System.out.println("I am shoe");
    }
}
