package cn.guokay.mekatok.husky.exception.consumer.login;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 账号身份校验失败
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0220", message = "Account identity verification failed")
public class IdentityException extends LoginException{

    public IdentityException() {
    }

    public IdentityException(String message) {
        super(message);
    }

    public IdentityException(String message, Throwable cause) {
        super(message, cause);
    }

    public IdentityException(Throwable cause) {
        super(cause);
    }

    public IdentityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
