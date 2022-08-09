package cn.guokay.mekatok.husky.exception.tripartite.timeout;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 缓存服务超时
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "C0230", message = "Cache service timed out")
public class CacheTimeOutException extends TimeOutException{

    public CacheTimeOutException() {
    }

    public CacheTimeOutException(String message) {
        super(message);
    }

    public CacheTimeOutException(String message, Throwable cause) {
        super(message, cause);
    }

    public CacheTimeOutException(Throwable cause) {
        super(cause);
    }

    public CacheTimeOutException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
