package org.spring.springboot.pattern.decorator;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
public class Person {

    private String name;

    public Person(){

    }

    public Person(String name){
        this.name = name;
    }

    public void show(){
        System.out.println(name+"dress the clothes");
    }
}
