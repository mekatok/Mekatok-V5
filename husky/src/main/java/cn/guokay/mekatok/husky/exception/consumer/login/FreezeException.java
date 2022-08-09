package cn.guokay.mekatok.husky.exception.consumer.login;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 账户被冻结
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0202", message = "Account has been frozen")
public class FreezeException extends LoginException{

    public FreezeException() {
    }

    public FreezeException(String message) {
        super(message);
    }

    public FreezeException(String message, Throwable cause) {
        super(message, cause);
    }

    public FreezeException(Throwable cause) {
        super(cause);
    }

    public FreezeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
