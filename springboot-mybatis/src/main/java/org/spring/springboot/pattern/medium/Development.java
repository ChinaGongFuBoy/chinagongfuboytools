package org.spring.springboot.pattern.medium;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
public class Development implements Department {

    private Coordinate coordinate;

    public Development(String name){
        coordinate.registerDepartment(name,this);
    }

    @Override
    public void saySomthing() {
        System.out.println("我们是研发部门，我们一直在开发的路上越走越远");
    }
}
