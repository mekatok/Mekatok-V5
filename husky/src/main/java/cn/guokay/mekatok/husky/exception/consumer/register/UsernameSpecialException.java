package cn.guokay.mekatok.husky.exception.consumer.register;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 用户名中包含特殊字符
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0113", message = "Username contains special characters")
public class UsernameSpecialException extends UsernameException{

    public UsernameSpecialException() {
    }

    public UsernameSpecialException(String message) {
        super(message);
    }

    public UsernameSpecialException(String message, Throwable cause) {
        super(message, cause);
    }

    public UsernameSpecialException(Throwable cause) {
        super(cause);
    }

    public UsernameSpecialException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
