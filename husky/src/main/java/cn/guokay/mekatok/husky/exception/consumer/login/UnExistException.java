package cn.guokay.mekatok.husky.exception.consumer.login;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 账号不存在
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0201", message = "Account does not exist")
public class UnExistException extends LoginException{

    public UnExistException() {
    }

    public UnExistException(String message) {
        super(message);
    }

    public UnExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnExistException(Throwable cause) {
        super(cause);
    }

    public UnExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
