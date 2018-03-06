package org.spring.springboot.pattern.decorator;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
public class Clothe extends Person {
    protected Person person;

    public void decorate(Person person){
        this.person = person;
    }

    @Override
    public void show(){
        if(person != null){
            person.show();
        }
    }
}
