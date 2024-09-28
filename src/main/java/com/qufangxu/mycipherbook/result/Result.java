package com.qufangxu.mycipherbook.result;

import java.io.Serializable;

public class Result<T> implements Serializable {

    /**
     * 响应码
     */
    private String code;

    /**
     * 响应结果
     */
    private boolean success;

    /**
     * 响应信息
     */
    private String message;

    /**
     * 数据体
     */
    private T data;

    /**
     * 无参的构造方法
     */
    public Result() {
    }

    /**
     * 含参的构造方法
     * @param code
     * @param success
     * @param message
     * @param data
     */
    public Result(String code, boolean success, String message, T data) {
        this.code = code;
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * 方法一：接口响应成功，返回成功信息，不含数据体
     * @param msg
     * @return
     */
    public static Result success(String msg){
        Result result = new Result();
        result.setCode("200");
        result.setSuccess(true);
        result.setMessage(msg);
        return result;
    }

    /**
     * 方法二：接口响应成功，返回成功信息及数据体
     * @param msg
     * @param data
     * @return
     */
    public Result success(String msg, T data){
        Result result = new Result();
        result.setCode("200");
        result.setSuccess(true);
        result.setMessage(msg);
        result.setData(data);
        return result;
    }

    /**
     * 方法三：接口响应失败，返回失败信息
     * @param msg
     * @return
     */
    public static Result fail(String msg){
        Result result = new Result();
        result.setCode("500");
        result.setSuccess(false);
        result.setMessage(msg);
        return result;
    }


}
