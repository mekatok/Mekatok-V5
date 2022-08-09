package cn.guokay.mekatok.husky.exception.consumer.login;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 账户已作废
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0203", message = "Account has been cancelled")
public class InvalidException extends LoginException{

    public InvalidException() {
    }

    public InvalidException(String message) {
        super(message);
    }

    public InvalidException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidException(Throwable cause) {
        super(cause);
    }

    public InvalidException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
