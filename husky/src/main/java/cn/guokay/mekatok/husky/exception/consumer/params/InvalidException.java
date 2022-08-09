package cn.guokay.mekatok.husky.exception.consumer.params;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 无效的用户输入
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0402", message = "invalid user input")
public class InvalidException extends ParamsException{

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
