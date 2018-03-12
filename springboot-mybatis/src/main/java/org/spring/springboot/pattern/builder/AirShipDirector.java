package org.spring.springboot.pattern.builder;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
public class AirShipDirector implements ShipDirector {

    private ShipBuilder shipBuilder;

    public AirShipDirector(ShipBuilder shipBuilder){
        this.shipBuilder = shipBuilder;
    }
    @Override
    public AirShip assembleAirShip() {
        AirShip airShip = new AirShip();
        airShip.setCabin(shipBuilder.getCabin());
        airShip.setEngine(shipBuilder.getEngine());
        airShip.setEscapeTower(shipBuilder.getEscapeTower());
        return airShip;
    }

    public ShipBuilder getShipBuilder() {
        return shipBuilder;
    }

    public void setShipBuilder(ShipBuilder shipBuilder) {
        this.shipBuilder = shipBuilder;
    }
}
