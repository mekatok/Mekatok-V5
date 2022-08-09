package cn.guokay.mekatok.husky.exception.consumer.register;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 用户基本信息异常
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0150", message = "User basic information is abnormal")
public class MainInfoException extends RegisterException{

    public MainInfoException() {
    }

    public MainInfoException(String message) {
        super(message);
    }

    public MainInfoException(String message, Throwable cause) {
        super(message, cause);
    }

    public MainInfoException(Throwable cause) {
        super(cause);
    }

    public MainInfoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
