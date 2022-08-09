package cn.guokay.mekatok.husky.exception.tripartite.middleware;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * key 长度超过限制
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "C0131", message = "key length exceeds the limit")
public class KeyTooLongException extends CacheServiceException{

    public KeyTooLongException() {
    }

    public KeyTooLongException(String message) {
        super(message);
    }

    public KeyTooLongException(String message, Throwable cause) {
        super(message, cause);
    }

    public KeyTooLongException(Throwable cause) {
        super(cause);
    }

    public KeyTooLongException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
