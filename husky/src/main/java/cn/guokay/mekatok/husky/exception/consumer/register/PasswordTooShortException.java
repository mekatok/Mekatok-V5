package cn.guokay.mekatok.husky.exception.consumer.register;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 密码长度不够
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0121", message = "Password is not long enough")
public class PasswordTooShortException extends PasswordException{

    public PasswordTooShortException() {
    }

    public PasswordTooShortException(String message) {
        super(message);
    }

    public PasswordTooShortException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordTooShortException(Throwable cause) {
        super(cause);
    }

    public PasswordTooShortException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
