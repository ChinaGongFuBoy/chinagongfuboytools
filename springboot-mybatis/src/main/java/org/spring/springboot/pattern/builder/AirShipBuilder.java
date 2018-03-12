package org.spring.springboot.pattern.builder;

/**
 * 飞船的具体组装
 * @author yigang.wu
 * @date created in $time $date
 */
public class AirShipBuilder implements ShipBuilder{
    @Override
    public Cabin getCabin() {
        System.out.println("万能座舱");
        return new Cabin("万能座舱");
    }

    @Override
    public Engine getEngine() {
        System.out.println("万能发动机");
        return new Engine("万能发动机");
    }

    @Override
    public EscapeTower getEscapeTower() {
        System.out.println("万能逃逸塔");
        return new EscapeTower("万能逃逸塔");
    }
}
