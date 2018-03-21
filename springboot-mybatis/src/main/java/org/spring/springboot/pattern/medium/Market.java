package org.spring.springboot.pattern.medium;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
public class Market implements Department {

    private Coordinate coordinate;

    public Market(String name,Coordinate coordinate){
        this.coordinate = coordinate;
        coordinate.registerDepartment(name,this);
    }
    @Override
    public void saySomthing() {
        System.out.println("我们是市场部的，我们刚刚接到一个订单，希望财务部门及时拨款");
        coordinate.command("finance");
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
}
