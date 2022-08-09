package cn.guokay.mekatok.husky.exception.consumer.login;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 密码输入次数过多
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0211", message = "Password entered too many times")
public class PasswordTooMuchException extends PasswordException{

    public PasswordTooMuchException() {
    }

    public PasswordTooMuchException(String message) {
        super(message);
    }

    public PasswordTooMuchException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordTooMuchException(Throwable cause) {
        super(cause);
    }

    public PasswordTooMuchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
