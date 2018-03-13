package org.cnsrdb.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.cnsrdb.constant.ResponseCode;

import java.io.Serializable;

/**
 * Created by rammel on 2018/1/6.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Vo<T> implements Serializable {

    private int code;
    private String msg;
    private T data;

    private Vo(){}
    private Vo(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    private Vo(int code, T data) {
        this.code = code;
        this.data = data;
    }
    private Vo(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    private Vo(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> Vo<T> createBySuccess(T data) {
        return new Vo<T>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getMsg(), data);
    }

    public static <T> Vo<T> createByFail(int code, String msg) {
        return new Vo<T>(code, msg);
    }

    public static <T> Vo<T> createBySuccess(String msg) {
        return new Vo<T>(ResponseCode.SUCCESS.getCode(), msg);
    }

    public static <T> Vo<T> createByError(String msg) {return new Vo<T>(ResponseCode.ERROR.getCode(), msg);}

}
