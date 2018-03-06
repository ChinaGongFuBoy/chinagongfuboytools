package org.spring.springboot.pattern.decorator;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
public class Test {

    public static void main(String[] args) {

        Person person = new Person("xiaoming");
        Tshrit tshrit = new Tshrit();
        Shoe shoe = new Shoe();
        tshrit.decorate(person);
        shoe.decorate(tshrit);
        shoe.show();
    }

}
