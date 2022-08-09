package cn.guokay.mekatok.husky.exception.tripartite.middleware;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 缓存 服务异常
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "C0130", message = "Cache service exception")
public class CacheServiceException extends MiddlewareException{

    public CacheServiceException() {
    }

    public CacheServiceException(String message) {
        super(message);
    }

    public CacheServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public CacheServiceException(Throwable cause) {
        super(cause);
    }

    public CacheServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
