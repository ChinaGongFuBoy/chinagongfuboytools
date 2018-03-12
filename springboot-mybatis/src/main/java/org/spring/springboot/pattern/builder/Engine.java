package org.spring.springboot.pattern.builder;

/**
 * 发动机
 * @author yigang.wu
 * @date created in $time $date
 */
public class Engine {

    private String name;

    public Engine(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
