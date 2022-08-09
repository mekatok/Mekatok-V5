package cn.guokay.mekatok.husky.exception.tripartite.middleware;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 配置 服务异常
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "C0140", message = "Config service exception")
public class ConfigServiceException extends MiddlewareException{

    public ConfigServiceException() {
    }

    public ConfigServiceException(String message) {
        super(message);
    }

    public ConfigServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConfigServiceException(Throwable cause) {
        super(cause);
    }

    public ConfigServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
