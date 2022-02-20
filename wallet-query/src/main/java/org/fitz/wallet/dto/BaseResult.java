package org.fitz.wallet.dto;

/**
 * http接口返回结果封装类
 *
 * @param <T>
 */
public class BaseResult<T> {
    private boolean success;
    private String message;
    private T data;

    public BaseResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public BaseResult(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public static BaseResult fail(String message) {
        return new BaseResult(false, message);
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
}
