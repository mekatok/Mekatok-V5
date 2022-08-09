package cn.guokay.mekatok.husky.exception.tripartite.middleware;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 储存容量已满
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "C0133", message = "storage capacity is full")
public class CapacityFullException extends CacheServiceException{

    public CapacityFullException() {
    }

    public CapacityFullException(String message) {
        super(message);
    }

    public CapacityFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public CapacityFullException(Throwable cause) {
        super(cause);
    }

    public CapacityFullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
