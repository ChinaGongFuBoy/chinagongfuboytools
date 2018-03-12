package org.spring.springboot.pattern.builder;

/**
 * 逃逸塔
 * @author yigang.wu
 * @date created in $time $date
 */
public class EscapeTower {
    private String name;

    public EscapeTower(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
