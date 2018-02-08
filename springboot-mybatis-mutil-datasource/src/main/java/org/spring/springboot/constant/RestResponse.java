package org.spring.springboot.constant;

import java.io.Serializable;

/**
 * @author yigang.wu
 * @date created in $time $data
 */
public class RestResponse<T> implements Serializable {

    /**消息*/
    private String msg;

    /**消息码*/
    private String code;

    /**是否成功*/
    private boolean isSuccess;

    /**泛型*/
    private T data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
