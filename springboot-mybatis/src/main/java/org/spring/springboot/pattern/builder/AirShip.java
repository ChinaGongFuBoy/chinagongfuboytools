package org.spring.springboot.pattern.builder;

/**
 * 建造飞船
 * @author yigang.wu
 * @date created in $time $date
 */
public class AirShip {

    private Cabin cabin;

    private Engine engine;

    private EscapeTower escapeTower;

    public Cabin getCabin() {
        return cabin;
    }

    public void setCabin(Cabin cabin) {
        this.cabin = cabin;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }
}
