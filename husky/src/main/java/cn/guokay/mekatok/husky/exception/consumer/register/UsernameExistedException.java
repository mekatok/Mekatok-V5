package cn.guokay.mekatok.husky.exception.consumer.register;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 用户名已存在
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0111", message = "Username already exists")
public class UsernameExistedException extends UsernameException{

    public UsernameExistedException() {
    }

    public UsernameExistedException(String message) {
        super(message);
    }

    public UsernameExistedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UsernameExistedException(Throwable cause) {
        super(cause);
    }

    public UsernameExistedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
