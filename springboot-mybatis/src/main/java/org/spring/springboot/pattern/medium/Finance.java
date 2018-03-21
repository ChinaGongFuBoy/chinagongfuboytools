package org.spring.springboot.pattern.medium;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
public class Finance implements Department {

    private Coordinate coordinate;

    public Finance(String name,Coordinate coordinate){
        this.coordinate = coordinate;
        coordinate.registerDepartment("finance",this);
    }

    @Override
    public void saySomthing() {
        System.out.println("我是财务部的，我们部门很有钱");
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
}
