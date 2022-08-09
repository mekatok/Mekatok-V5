package cn.guokay.mekatok.husky.exception.provider;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 系统资源访问异常
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "B0320", message = "System resource access exception")
public class ResourceAccessException extends ResourceException {

    public ResourceAccessException() {
    }

    public ResourceAccessException(String message) {
        super(message);
    }

    public ResourceAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceAccessException(Throwable cause) {
        super(cause);
    }

    public ResourceAccessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
