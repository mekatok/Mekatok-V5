package cn.guokay.mekatok.husky.exception.consumer.register;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 密码校验失败
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0120", message = "Password verification failed")
public class PasswordException extends RegisterException{

    public PasswordException() {
    }

    public PasswordException(String message) {
        super(message);
    }

    public PasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordException(Throwable cause) {
        super(cause);
    }

    public PasswordException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
