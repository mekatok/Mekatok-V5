package cn.guokay.mekatok.husky.exception.consumer.version;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 用户请求API版本过低
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0803", message = "User request API version is too low")
public class VersionTooLowException extends VersionException{

    public VersionTooLowException() {
    }

    public VersionTooLowException(String message) {
        super(message);
    }

    public VersionTooLowException(String message, Throwable cause) {
        super(message, cause);
    }

    public VersionTooLowException(Throwable cause) {
        super(cause);
    }

    public VersionTooLowException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
