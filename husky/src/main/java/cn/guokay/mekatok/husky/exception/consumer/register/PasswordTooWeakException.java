package cn.guokay.mekatok.husky.exception.consumer.register;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 密码强度不够
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0122", message = "Password is not strong enough")
public class PasswordTooWeakException extends PasswordException{

    public PasswordTooWeakException() {
    }

    public PasswordTooWeakException(String message) {
        super(message);
    }

    public PasswordTooWeakException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordTooWeakException(Throwable cause) {
        super(cause);
    }

    public PasswordTooWeakException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
