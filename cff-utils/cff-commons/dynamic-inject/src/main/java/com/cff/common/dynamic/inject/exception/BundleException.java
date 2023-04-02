package com.cff.common.dynamic.inject.exception;

/**
 * @Class: com.cff.common.dynamic.inject.exception.BundleException
 * @Desc:
 * @author: luwu
 * @Date: 2023-04-02 16:02
 */
public class BundleException extends RuntimeException{

    private static final long serialVersionID=1L;

    private String errCode;

    public BundleException(String message) {
        super(message);
    }

    public BundleException(String message, Throwable cause) {
        super(message, cause);
    }

    public BundleException(String message, Throwable cause, String errCode) {
        super(message, cause);
        this.errCode = errCode;
    }

    public BundleException(Throwable cause, String errCode) {
        super(cause);
        this.errCode = errCode;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }
}
