package org.spring.springboot.pattern.medium;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
public class Test {

    public static void main(String[] args) {
        Coordinate coordinate = new Manger();
        Market market = new Market("market",coordinate);
        Finance finance = new Finance("finance",coordinate);
        market.saySomthing();
    }

}
