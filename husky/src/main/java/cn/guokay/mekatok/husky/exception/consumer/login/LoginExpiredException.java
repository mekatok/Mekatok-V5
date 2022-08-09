package cn.guokay.mekatok.husky.exception.consumer.login;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 账户登录已过期
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0230", message = "Account login has expired")
public class LoginExpiredException extends LoginException{

    public LoginExpiredException() {
    }

    public LoginExpiredException(String message) {
        super(message);
    }

    public LoginExpiredException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginExpiredException(Throwable cause) {
        super(cause);
    }

    public LoginExpiredException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
