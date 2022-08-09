package cn.guokay.mekatok.husky.exception.tripartite.middleware;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * key 长度超过限制
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "C0132", message = "value length exceeds the limit")
public class ValueTooLongException extends CacheServiceException{

    public ValueTooLongException() {
    }

    public ValueTooLongException(String message) {
        super(message);
    }

    public ValueTooLongException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValueTooLongException(Throwable cause) {
        super(cause);
    }

    public ValueTooLongException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
