package org.spring.springboot.concurrent;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
public class Main {

    public static void main(String[] args) {
        boolean flag = false;
        try {
            flag = ApplicationStartupUtil.getInstance().checkExternalServices();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("The services is validate completed. The reslut is "+flag);
    }
}
