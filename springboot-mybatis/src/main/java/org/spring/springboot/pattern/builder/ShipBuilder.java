package org.spring.springboot.pattern.builder;

/**
 * 飞船的建造者
 * @author yigang.wu
 * @date created in $time $date
 */
public interface ShipBuilder {

    public Cabin getCabin();

    public Engine getEngine();

    public EscapeTower getEscapeTower();
}
