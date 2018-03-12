package org.spring.springboot.pattern.builder;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
public class Test {

    public static void main(String[] args) {
        ShipBuilder shipBuilder = new AirShipBuilder();
        AirShipDirector airShipDirector = new AirShipDirector(shipBuilder);
        airShipDirector.assembleAirShip();
    }
}
