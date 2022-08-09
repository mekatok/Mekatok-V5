package cn.guokay.mekatok.husky.exception.consumer.params;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 参数格式不匹配
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0421", message = "parameter format mismatch")
public class MismatchException extends ScopeException{

    public MismatchException() {
    }

    public MismatchException(String message) {
        super(message);
    }

    public MismatchException(String message, Throwable cause) {
        super(message, cause);
    }

    public MismatchException(Throwable cause) {
        super(cause);
    }

    public MismatchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
