package cn.guokay.mekatok.husky.exception.tripartite.timeout;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 配置服务超时
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "C0240", message = "Config service timed out")
public class ConfigTimeOutException extends TimeOutException{

    public ConfigTimeOutException() {
    }

    public ConfigTimeOutException(String message) {
        super(message);
    }

    public ConfigTimeOutException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConfigTimeOutException(Throwable cause) {
        super(cause);
    }

    public ConfigTimeOutException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
