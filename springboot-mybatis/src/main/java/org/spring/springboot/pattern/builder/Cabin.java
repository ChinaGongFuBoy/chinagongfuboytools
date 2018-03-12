package org.spring.springboot.pattern.builder;

/**
 * 座舱
 * @author yigang.wu
 * @date created in $time $date
 */
public class Cabin {

    private String name;

    public Cabin(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
