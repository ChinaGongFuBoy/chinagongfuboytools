package org.spring.springboot.exception;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
public class MyException extends RuntimeException {

    private String errorCode;

    public MyException(String errorCode,String errMsg){
        super(errMsg);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
