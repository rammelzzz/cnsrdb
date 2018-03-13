package org.cnsrdb.constant;

/**
 * Created by rammel on 2018/1/6.
 */
public enum ResponseCode {
    SUCCESS(1, "登录成功!"),
    PASSWORD_ERROR(2, "密码错误"),
    USER_NOT_FOUNT(3, "用户名不存在"),
    ERROR(4, "未知错误");

    int code;
    String msg;

    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
